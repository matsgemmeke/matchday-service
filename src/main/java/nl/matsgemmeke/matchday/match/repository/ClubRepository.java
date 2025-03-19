package nl.matsgemmeke.matchday.match.repository;

import nl.matsgemmeke.matchday.match.repository.entity.ClubEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ClubRepository extends CrudRepository<ClubEntity, UUID> {
}
