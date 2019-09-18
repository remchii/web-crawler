package se.remchii.webcrawler.cirnopedia;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.remchii.webcrawler.Crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CirnopediaCrawler implements Crawler {

    private static final String BASE_URL = "http://fate-go.cirnopedia.org";
    private static final String CE_URI = "/craft_essence_profile.php?essence=";
    private static final Logger LOG = LoggerFactory.getLogger(CirnopediaCrawler.class);

    @Override
    public List<Document> getAllCeDocuments() {
        List<Document> cePages = new ArrayList<>();
        int id = 1095;
        boolean isMorePages = true;
        while (isMorePages) {
            Optional<Document> ceDoc = getCeDocument(id);
            if (ceDoc.isPresent()) {
                int ceId = getCeIdNo(ceDoc.get());
                if (id == ceId) {
                    cePages.add(ceDoc.get());
                    id++;
                } else {
                    isMorePages = false;
                    LOG.info("No more craft essence");
                }
            }
        }

        return cePages;
    }

    private Optional<Document> getCeDocument(int id) {
        Document doc = null;
        try {
            doc = Jsoup.connect(BASE_URL + CE_URI + id).get();
            LOG.info("Getting craft essence page id: {}", id);
        } catch (IOException e) {
            LOG.warn("Error getting craft essence page id: {}", id, e);
        }

        return Optional.ofNullable(doc);
    }

    private int getCeIdNo(Document ceDoc) {
        String idText = ceDoc.body()
                .select("table#rounded-corner")
                .get(0)
                .selectFirst("tbody > tr:nth-child(2) .desc")
                .text();

        return Integer.parseInt(idText);
    }
}
