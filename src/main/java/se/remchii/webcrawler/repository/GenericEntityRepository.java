package se.remchii.webcrawler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.remchii.webcrawler.model.GenericEntity;

@Repository
public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {
}
