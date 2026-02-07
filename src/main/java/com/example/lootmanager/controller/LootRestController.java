package com.example.lootmanager.controller;

import com.example.lootmanager.dto.PlayerRequestDTO;
import com.example.lootmanager.model.Player;   // ← TEM que existir
import com.example.lootmanager.service.PlayerService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loot")
@Tag(name = "Loot Manager", description = "Endpoints de gerenciamento de jogadores e loot da raid")
public class LootRestController {

    private final PlayerService playerService;

    public LootRestController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // CREATE PLAYER
    @PostMapping("/player")
    public Player createPlayer(@Valid @RequestBody PlayerRequestDTO dto) {
        return playerService.create(dto);
    }

    // LIST PLAYERS
    @GetMapping("/players")
    public List<Player> listPlayers() {
        return playerService.findAll();
    }
}
