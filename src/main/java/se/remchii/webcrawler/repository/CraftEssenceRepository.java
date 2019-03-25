package se.remchii.webcrawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.remchii.webcrawler.model.CraftEssence;

@Repository
public interface CraftEssenceRepository extends JpaRepository<CraftEssence, Long> {
}
