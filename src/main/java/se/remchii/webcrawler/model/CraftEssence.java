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
    private String imgUrl;
    private int rarity;
    private int maxLvl;
    private int attack;
    private int maxAttack;
    private int hp;
    private int maxHp;
    private String effect; // TODO change into an object?
    private String maxEffect;
    private String illustrator;
    private String cv;
    private String japaneseText;
    private String englishText;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getMaxLvl() {
        return maxLvl;
    }

    public void setMaxLvl(int maxLvl) {
        this.maxLvl = maxLvl;
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

    @Override
    public String toString() {
        return "CraftEssence{" +
                "id=" + id +
                ", idNo=" + idNo +
                ", name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", rarity=" + rarity +
                ", maxLvl=" + maxLvl +
                ", attack=" + attack +
                ", maxAttack=" + maxAttack +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", effect='" + effect + '\'' +
                ", maxEffect='" + maxEffect + '\'' +
                ", illustrator='" + illustrator + '\'' +
                ", cv='" + cv + '\'' +
                ", japaneseText='" + japaneseText + '\'' +
                ", englishText='" + englishText + '\'' +
                '}';
    }
}
