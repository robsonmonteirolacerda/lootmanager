package com.example.lootmanager.controller;

import com.example.lootmanager.dto.PlayerRequestDTO;
import com.example.lootmanager.model.Player;
import com.example.lootmanager.service.PlayerService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.lootmanager.response.ApiSuccessResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;


import java.util.List;

@Tag(name = "Loot", description = "Gerenciamento de players e loots")
@RestController
@RequestMapping("/api/v1/loot")
public class LootRestController {

    private final PlayerService playerService;

    public LootRestController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Operation(summary = "Criar player", description = "Cria um novo player no sistema")
    @PostMapping("/players")
    public ApiSuccessResponse<Player> createPlayer(
            @Valid @RequestBody PlayerRequestDTO dto,
            HttpServletRequest request
    ) {
        Player player = playerService.create(dto);

        return ApiSuccessResponse.created(
                player,
                request.getRequestURI()
        );
    }

    @Operation(summary = "Listar players", description = "Lista todos os players cadastrados")
    @GetMapping("/players")
    public ApiSuccessResponse<List<Player>> listPlayers(HttpServletRequest request) {
        List<Player> players = playerService.findAll();

        return ApiSuccessResponse.ok(players, request.getRequestURI());
    }
}
