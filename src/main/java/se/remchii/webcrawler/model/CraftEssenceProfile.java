package se.remchii.webcrawler.model;

import javax.persistence.Embeddable;

@Embeddable
public class CraftEssenceProfile {
    private String illustrator;
    private String cv;

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "CraftEssenceProfile{" +
                "illustrator='" + illustrator + '\'' +
                ", cv='" + cv + '\'' +
                '}';
    }
}
