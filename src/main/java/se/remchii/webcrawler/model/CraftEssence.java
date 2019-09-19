package se.remchii.webcrawler.model;

import javax.persistence.*;

@Entity
public class CraftEssence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CraftEssenceStats ceStats;
    private CraftEssenceProfile ceProfile;
    private CraftEssenceText ceText;

    public CraftEssence() {
    }

    public Long getId() {
        return id;
    }

    public CraftEssenceStats getCeStats() {
        return ceStats;
    }

    public void setCeStats(CraftEssenceStats ceStats) {
        this.ceStats = ceStats;
    }

    public CraftEssenceProfile getCeProfile() {
        return ceProfile;
    }

    public void setCeProfile(CraftEssenceProfile ceProfile) {
        this.ceProfile = ceProfile;
    }

    public CraftEssenceText getCeText() {
        return ceText;
    }

    public void setCeText(CraftEssenceText ceText) {
        this.ceText = ceText;
    }

    @Override
    public String toString() {
        return "CraftEssence{" +
                "id=" + id +
                ", ceStats=" + ceStats +
                ", ceProfile=" + ceProfile +
                ", ceText=" + ceText +
                '}';
    }
}
