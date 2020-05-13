package com.margarita.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ScheduleDTO {
    private String scheDate, stadiumId, gubun, hometeamId, awayteamId;
    private int homeScore, awayScore;
}
