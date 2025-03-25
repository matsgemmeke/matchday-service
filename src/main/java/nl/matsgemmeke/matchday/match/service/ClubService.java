package nl.matsgemmeke.matchday.match.service;

import lombok.RequiredArgsConstructor;
import nl.matsgemmeke.matchday.match.controller.dto.ClubDTO;
import nl.matsgemmeke.matchday.match.mapper.ClubMapper;
import nl.matsgemmeke.matchday.match.repository.ClubRepository;
import nl.matsgemmeke.matchday.match.repository.entity.ClubEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ClubService {

    private final ClubMapper clubMapper;
    private final ClubRepository clubRepository;

    public void createClub(ClubDTO clubDTO) {
        ClubEntity clubEntity = clubMapper.toClubEntity(clubDTO);

        clubRepository.save(clubEntity);
    }

    public List<ClubDTO> getAllClubs() {
        Iterable<ClubEntity> clubEntities = clubRepository.findAll();

        return StreamSupport.stream(clubEntities.spliterator(), false)
                .map(clubMapper::toClubDTO)
                .toList();
    }

    public ClubDTO getClub(UUID clubId) {
        ClubEntity clubEntity = clubRepository.findById(clubId)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find club by id %s".formatted(clubId)));

        return clubMapper.toClubDTO(clubEntity);
    }
}
