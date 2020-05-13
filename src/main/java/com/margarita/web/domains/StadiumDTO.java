package com.margarita.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StadiumDTO {
    private String stadiumId, stadiumName, hometeamId, address, ddd, tel;
    private int seatCount;
}
