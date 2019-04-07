package se.remchii.webcrawler.cirnopedia;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.remchii.webcrawler.Parser;
import se.remchii.webcrawler.model.CraftEssence;
import se.remchii.webcrawler.model.CraftEssenceProfile;
import se.remchii.webcrawler.model.CraftEssenceStats;
import se.remchii.webcrawler.model.CraftEssenceText;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CirnopediaParser implements Parser {

    private static final Logger LOG = LoggerFactory.getLogger(CirnopediaParser.class);

    @Override
    public List<CraftEssence> parseCePages(List<Document> ceDocuments) {
        List<CraftEssence> craftEssences = new ArrayList<>();
        for (Document ceDoc : ceDocuments) {
            CraftEssence craftEssence = parseCeInfo(ceDoc);
            craftEssences.add(craftEssence);
        }

        return craftEssences;
    }

    private CraftEssence parseCeInfo(Document ceDoc) {
        Elements ceInfo = ceDoc.body().select("table#rounded-corner");
        CraftEssence craftEssence = new CraftEssence();
        try {
            CraftEssenceStats ceStats = parseCeStats(ceInfo.get(0));
            CraftEssenceProfile ceProfile = parseCeProfile(ceInfo.get(1));
            CraftEssenceText ceText = parseCeText(ceInfo.get(2));
        } catch (IndexOutOfBoundsException e) {
            LOG.warn("Some craft essence info could not be parsed", e);
        }

        return craftEssence;
    }

    private CraftEssenceStats parseCeStats(Element ceStats) {
        Elements statsElements = ceStats.select("td.desc");
        CraftEssenceStats stats = new CraftEssenceStats();
        try {
            stats.setName(statsElements.get(0).text());
            stats.setIdNo(Integer.parseInt(statsElements.get(1).text()));
            stats.setRarity(parseRarity(statsElements.get(2)));
            stats.setCost(Integer.parseInt(statsElements.get(3).text()));
            stats.setMaxLevel(Integer.parseInt(statsElements.get(4).text()));
            stats.setAttack(parseNumber(statsElements.get(5).text()));
            stats.setMaxAttack(parseNumber(statsElements.get(6).text()));
            stats.setHp(parseNumber(statsElements.get(7).text()));
            stats.setMaxHp(parseNumber(statsElements.get(8).text()));
            stats = parseEventEffect(stats, statsElements.get(9));
            stats = parseEventEffect(stats, statsElements.get(10));


        } catch (IndexOutOfBoundsException e) {
            LOG.warn("Craft essence stats index out of bound");
        } catch (NumberFormatException e) {
            LOG.warn("Error parsing text to integer");
        }

        return stats;
    }

    private int parseNumber(String text) {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        Number number = null;
        try {
            number = format.parse(text);
        } catch (ParseException e) {
            LOG.warn("Could not parse {} to integer", text);
        }
        return number.intValue();
    }

    private int parseRarity(Element rarity) {
        return rarity.text().split(" ")[0].trim().length();
    }

    private CraftEssenceStats parseEventEffect(CraftEssenceStats ceStats, Element statsElement) {
        Element effectElement = statsElement;
        Elements eventElements = effectElement.select("event");
        String effectText = effectElement.text();
        if (!eventElements.isEmpty()) {
            String eventEffectText = eventElements.get(0).text();
            effectText = effectElement.text().replace(eventEffectText, "").trim();
            if (!effectText.toLowerCase().contains("[max limit]")) {
                ceStats.setEffect(effectText);
                ceStats.setEventEffect(eventEffectText);
            } else {
                ceStats.setMaxEffect(effectText);
                ceStats.setMaxEventEffect(eventEffectText);
            }
        } else {
            if (!effectText.toLowerCase().contains("[max limit]")) {
                ceStats.setEffect(effectText);
            } else {
                ceStats.setMaxEffect(effectText);
            }
        }

        return ceStats;
    }

    private CraftEssenceProfile parseCeProfile(Element ceProfile) {
        CraftEssenceProfile craftEssenceProfile = new CraftEssenceProfile();

        return craftEssenceProfile;
    }

    private CraftEssenceText parseCeText(Element text) {
        Elements textElements = text.select("td.desc");
        CraftEssenceText ceText = new CraftEssenceText();
        try {
            ceText.setJapaneseText(textElements.get(0).text());
            ceText.setEnglishText(textElements.get(1).text());
        } catch (IndexOutOfBoundsException e) {
            LOG.warn("Craft essence text index out of bound");
        }

        return ceText;
    }
}
