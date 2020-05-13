package com.margarita.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlayerDTO {
    public String playerId, teamId, playerName, ePlayerName, nickName, joinYyyy, position, nation,birthDate,solar,backNo, height, weight;

}
