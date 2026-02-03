package controller;


import model.Player;
import service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

    private final PlayerService service;

    public PlayerRestController(PlayerService service) {
        this.service = service;
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return service.save(player);
    }

    @GetMapping
    public List<Player> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Player get(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

