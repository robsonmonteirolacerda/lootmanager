package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "loot", schema = "wow") // já usando o schema wow
public class Loot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private String playerName;

    @Column(nullable = false)
    private String rarity;

    @Column(nullable = false)
    private LocalDateTime dropDate;

    // Construtor vazio (obrigatório pro JPA)
    public Loot() {}

    // Construtor útil
    public Loot(String itemName, String playerName, String rarity) {
        this.itemName = itemName;
        this.playerName = playerName;
        this.rarity = rarity;
        this.dropDate = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public String getRarity() { return rarity; }
    public void setRarity(String rarity) { this.rarity = rarity; }

    public LocalDateTime getDropDate() { return dropDate; }
    public void setDropDate(LocalDateTime dropDate) { this.dropDate = dropDate; }
}
