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

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getMaxEffect() {
        return maxEffect;
    }

    public void setMaxEffect(String maxEffect) {
        this.maxEffect = maxEffect;
    }

    public String getEventEffect() {
        return eventEffect;
    }

    public void setEventEffect(String eventEffect) {
        this.eventEffect = eventEffect;
    }

    public String getMaxEventEffect() {
        return maxEventEffect;
    }

    public void setMaxEventEffect(String maxEventEffect) {
        this.maxEventEffect = maxEventEffect;
    }

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
