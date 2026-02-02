package service;

import model.Loot;
import repository.LootRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LootService {

    private final LootRepository lootRepository;

    public LootService(LootRepository lootRepository) {
        this.lootRepository = lootRepository;
    }

    public Loot save(Loot loot) {
        return lootRepository.save(loot);
    }

    public List<Loot> findAll() {
        return lootRepository.findAll();
    }

    public Loot findById(Long id) {
        return lootRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loot não encontrado"));
    }

    public void delete(Long id) {
        lootRepository.deleteById(id);
    }
}
