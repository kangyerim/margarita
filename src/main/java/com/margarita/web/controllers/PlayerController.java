package com.margarita.web.controllers;

import com.margarita.web.domains.PlayerDTO;
import com.margarita.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;

    @GetMapping("")
    public List<PlayerDTO> getList(){
        return playerService.retrieveAll();
    }

    @PostMapping("/{playerId}/access")
    public Map<String,Object> login(
            @PathVariable String  playerId,
            @RequestBody PlayerDTO player){
        Map<String,Object> map = new HashMap<>();
        player = playerService.login(player);
        if(player != null) {
            System.out.println("login info : "+player.toString());
            map.put("result",true);
        } else {
            map.put("result",false);
        }
        map.put("player",player);
        return map;
    }
}
