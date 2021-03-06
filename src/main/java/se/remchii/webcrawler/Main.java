package se.remchii.webcrawler;

import org.jsoup.nodes.Document;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import se.remchii.webcrawler.cirnopedia.CirnopediaCrawler;
import se.remchii.webcrawler.cirnopedia.CirnopediaParser;
import se.remchii.webcrawler.model.CraftEssence;
import se.remchii.webcrawler.repository.CraftEssenceRepository;

import java.util.List;

public class Main {

    private CraftEssenceRepository repository;

    public Main() {
        this.repository = BeanUtil.getBean(CraftEssenceRepository.class);
    }

    public void start() {
        Crawler crawler = new CirnopediaCrawler();
        Parser parser = new CirnopediaParser();

        List<Document> ceDocuments = crawler.getAllCeDocuments();
        List<CraftEssence> craftEssences = parser.parseCePages(ceDocuments);
        for (CraftEssence ce : craftEssences) {
            System.out.println(ce);
        }
        repository.saveAll(craftEssences);
    }
}
