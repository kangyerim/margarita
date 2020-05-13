package com.margarita.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlayerDTO {
    private String playerId, teamId, playerName, ePlayerName, nickName, joinYyyy, position, nation,birthDate,solar;
    private int backNo, height, weight;
}
