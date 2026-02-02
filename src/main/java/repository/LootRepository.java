package repository;

import model.Loot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LootRepository extends JpaRepository<Loot, Long> {
    // aqui entram consultas customizadas depois
}