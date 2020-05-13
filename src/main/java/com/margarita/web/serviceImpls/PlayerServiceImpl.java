package com.margarita.web.serviceImpls;

import com.margarita.web.domains.PlayerDTO;
import com.margarita.web.mappers.PlayerMapper;
import com.margarita.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired PlayerMapper playerMapper;
    @Override
    public List<PlayerDTO> retrieveAll() {
        return playerMapper.selectAll();
    }
}
