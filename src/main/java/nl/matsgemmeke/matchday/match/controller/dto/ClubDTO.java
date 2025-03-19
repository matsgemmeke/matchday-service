package nl.matsgemmeke.matchday.match.controller.dto;

import org.springframework.lang.NonNull;

import java.util.UUID;

public record ClubDTO(
        @NonNull UUID id,
        @NonNull String name,
        @NonNull String city
) { }
