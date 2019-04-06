package se.remchii.webcrawler;

import org.jsoup.nodes.Document;
import se.remchii.webcrawler.model.CraftEssence;

import java.util.List;

public interface Parser {

    List<CraftEssence> parseCePages(List<Document> cePages);
}
