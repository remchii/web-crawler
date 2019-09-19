package se.remchii.webcrawler.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CraftEssenceText {
    @Column(length = 1024)
    private String japaneseText;
    @Column(length = 1024)
    private String englishText;

    public String getJapaneseText() {
        return japaneseText;
    }

    public void setJapaneseText(String japaneseText) {
        this.japaneseText = japaneseText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    @Override
    public String toString() {
        return "CraftEssenceText{" +
                "japaneseText='" + japaneseText + '\'' +
                ", englishText='" + englishText + '\'' +
                '}';
    }
}
