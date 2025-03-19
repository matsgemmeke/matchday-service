package nl.matsgemmeke.matchday.match.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.matsgemmeke.matchday.match.controller.dto.ClubDTO;
import nl.matsgemmeke.matchday.match.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/club")
@RequiredArgsConstructor
@Slf4j
public class ClubController {

    private final ClubService clubService;

    @GetMapping("/")
    public ResponseEntity<List<ClubDTO>> getAllClubs() {
        log.info("Handling GET request: getAllClubs");
        return ResponseEntity.ok(clubService.getAllClubs());
    }

    @PostMapping("/")
    public ResponseEntity<Void> postClub(@RequestBody ClubDTO clubDTO) {
        log.info("Handling POST request: postClub with body " + clubDTO);
        clubService.createClub(clubDTO);
        return ResponseEntity.accepted().build();
    }
}
