package nl.matsgemmeke.matchday.match.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.matsgemmeke.matchday.match.controller.dto.ClubDTO;
import nl.matsgemmeke.matchday.match.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/club")
@RequiredArgsConstructor
@Slf4j
public class ClubController {

    private final ClubService clubService;

    @GetMapping
    public ResponseEntity<List<ClubDTO>> getAllClubs() {
        log.info("Handling GET request: getAllClubs");
        return ResponseEntity.ok(clubService.getAllClubs());
    }

    @GetMapping("/{clubId}")
    public ResponseEntity<ClubDTO> getClub(@RequestParam UUID clubId) {
        log.info("Handling GET request: getClubs with club id %s".formatted(clubId));
        return ResponseEntity.ok(clubService.getClub(clubId));
    }

    @PostMapping
    public ResponseEntity<Void> postClub(@RequestBody ClubDTO clubDTO) {
        log.info("Handling POST request: postClub with body %s".formatted(clubDTO));
        clubService.createClub(clubDTO);
        return ResponseEntity.accepted().build();
    }
}
