package se.remchii.webcrawler;

import org.jsoup.nodes.Document;
import se.remchii.webcrawler.model.web.CraftEssenceWeb;

import java.util.List;

public interface Parser {

    List<CraftEssenceWeb> parseCePages(List<Document> cePages);
}
