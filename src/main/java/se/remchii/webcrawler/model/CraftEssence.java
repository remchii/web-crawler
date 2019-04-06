package se.remchii.webcrawler.model;

import javax.persistence.*;

@Entity
public class CraftEssence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private int idNo;
    private String name;
    private int rarity;
    private int cost;
    private int maxLevel;
    private int attack;
    private int maxAttack;
    private int hp;
    private int maxHp;
    private String effect;
    private String maxEffect;
    private String eventEffect;
    private String maxEventEffect;
    private String illustrator;
    private String cv;
    private String japaneseText;
    private String englishText;
    private String imageUrl;

    public CraftEssence() {
    }

    public Long getId() {
        return id;
    }

    public int getIdNo() {
        return idNo;
    }

    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    public int getCost() {
        return cost;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getAttack() {
        return attack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public String getEffect() {
        return effect;
    }

    public String getMaxEffect() {
        return maxEffect;
    }

    public String getEventEffect() {
        return eventEffect;
    }

    public String getMaxEventEffect() {
        return maxEventEffect;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public String getCv() {
        return cv;
    }

    public String getJapaneseText() {
        return japaneseText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "CraftEssence{" +
                "id=" + id +
                ", idNo=" + idNo +
                ", name='" + name + '\'' +
                ", rarity=" + rarity +
                ", cost=" + cost +
                ", maxLevel=" + maxLevel +
                ", attack=" + attack +
                ", maxAttack=" + maxAttack +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", effect='" + effect + '\'' +
                ", maxEffect='" + maxEffect + '\'' +
                ", eventEffect='" + eventEffect + '\'' +
                ", maxEventEffect='" + maxEventEffect + '\'' +
                ", illustrator='" + illustrator + '\'' +
                ", cv='" + cv + '\'' +
                ", japaneseText='" + japaneseText + '\'' +
                ", englishText='" + englishText + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
