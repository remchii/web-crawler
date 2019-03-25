package se.remchii.webcrawler;

import org.jsoup.nodes.Document;
import se.remchii.webcrawler.cirnopedia.CirnopediaCrawler;
import se.remchii.webcrawler.cirnopedia.CirnopediaParser;

import java.util.List;

public class Main {

    public void start() {
        Crawler crawler = new CirnopediaCrawler();
        Parser parser = new CirnopediaParser();

        List<Document> ceDocuments = crawler.getAllCeDocuments();
    }
}
