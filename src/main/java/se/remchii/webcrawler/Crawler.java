package se.remchii.webcrawler;

import org.jsoup.nodes.Document;

import java.util.List;

public interface Crawler {

    List<Document> getAllCeDocuments();
}
