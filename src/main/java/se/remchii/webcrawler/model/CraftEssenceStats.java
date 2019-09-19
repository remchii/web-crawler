package se.remchii.webcrawler.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CraftEssenceStats {
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
    @Column(length = 512)
    private String effect;
    @Column(length = 512)
    private String maxEffect;
    @Column(length = 512)
    private String eventEffect;
    @Column(length = 512)
    private String maxEventEffect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
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

    @Override
    public String toString() {
        return "CraftEssenceStats{" +
                "idNo=" + idNo +
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
                '}';
    }
}
