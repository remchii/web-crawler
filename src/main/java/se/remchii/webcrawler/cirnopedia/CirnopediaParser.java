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

import java.util.ArrayList;
import java.util.List;

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
            LOG.warn("Some craft essence info could not be read", e);
        }

        return craftEssence;
    }

    private CraftEssenceStats parseCeStats(Element ceStats) {
        CraftEssenceStats craftEssenceStats = new CraftEssenceStats();

        return craftEssenceStats;
    }

    private CraftEssenceProfile parseCeProfile(Element ceProfile) {
        CraftEssenceProfile craftEssenceProfile = new CraftEssenceProfile();

        return craftEssenceProfile;
    }

    private CraftEssenceText parseCeText(Element ceText) {
        CraftEssenceText craftEssenceText = new CraftEssenceText();

        return craftEssenceText;
    }
}
