package se.remchii.webcrawler.model;

public class CraftEssenceText {
    private String japaneseText;
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
