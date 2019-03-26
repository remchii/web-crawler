package se.remchii.webcrawler;

import org.jsoup.nodes.Document;
import se.remchii.webcrawler.cirnopedia.CirnopediaCrawler;
import se.remchii.webcrawler.cirnopedia.CirnopediaParser;
import se.remchii.webcrawler.model.CraftEssence;

import java.util.List;

public class Main {

    public void start() {
        Crawler crawler = new CirnopediaCrawler();
        Parser parser = new CirnopediaParser();

        List<Document> ceDocuments = crawler.getAllCeDocuments();
        List<CraftEssence> craftEssences = parser.parseCePages(ceDocuments);
        for (CraftEssence ce : craftEssences) {
            System.out.println(ce);
        }
    }
}
