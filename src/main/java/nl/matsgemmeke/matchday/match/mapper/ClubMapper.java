package nl.matsgemmeke.matchday.match.mapper;

import nl.matsgemmeke.matchday.match.controller.dto.ClubDTO;
import nl.matsgemmeke.matchday.match.repository.entity.ClubEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ClubMapper {

    ClubDTO toClubDTO(ClubEntity clubEntity);

    ClubEntity toClubEntity(ClubDTO clubDTO);
}
