package com.margarita.web.mappers;

import com.margarita.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDTO> selectAll();
    public PlayerDTO login(PlayerDTO player);
}
