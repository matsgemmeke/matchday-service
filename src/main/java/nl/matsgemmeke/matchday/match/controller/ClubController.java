package nl.matsgemmeke.matchday.match.controller;

import lombok.RequiredArgsConstructor;
import nl.matsgemmeke.matchday.match.controller.dto.ClubDTO;
import nl.matsgemmeke.matchday.match.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/club")
@RequiredArgsConstructor
public class ClubController {

    private final ClubService clubService;

    @GetMapping("/")
    public ResponseEntity<List<ClubDTO>> getAllClubs() {
        return ResponseEntity.ok(clubService.getAllClubs());
    }

    @PostMapping("/")
    public ResponseEntity<Void> postClub(@RequestBody ClubDTO clubDTO) {
        clubService.createClub(clubDTO);
        return ResponseEntity.accepted().build();
    }
}
