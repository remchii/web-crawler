package se.remchii.webcrawler.model;

public class CraftEssenceStats {
    private String name;
    private int idNo;
    private int rarity;
    private int cost;
    private int maxLevel;
    private String attack;
    private String maxAttack;
    private String hp;
    private String maxHp;
    private String effect;
    private String maxEffect;
    private String eventEffect;
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

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(String maxAttack) {
        this.maxAttack = maxAttack;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(String maxHp) {
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
                "name='" + name + '\'' +
                ", idNo=" + idNo +
                ", rarity=" + rarity +
                ", cost=" + cost +
                ", maxLevel=" + maxLevel +
                ", attack='" + attack + '\'' +
                ", maxAttack='" + maxAttack + '\'' +
                ", hp='" + hp + '\'' +
                ", maxHp='" + maxHp + '\'' +
                ", effect='" + effect + '\'' +
                ", maxEffect='" + maxEffect + '\'' +
                ", eventEffect='" + eventEffect + '\'' +
                ", maxEventEffect='" + maxEventEffect + '\'' +
                '}';
    }
}
