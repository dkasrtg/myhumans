package com.myhumans.myhumans.entity.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/humans")
public class HumanController {
    @Autowired
    private HumanService humanService;

    @PostMapping
    public ResponseEntity<Human> createHuman(@RequestBody Human human) {
        return ResponseEntity.ok(humanService.createHuman(human));
    }

    @GetMapping
    public ResponseEntity<List<Human>> getAllHumans() {
        return ResponseEntity.ok(humanService.getAllHumans());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Human> getHById(@PathVariable Long id) {
        Human human = humanService.getHumanById(id);
        if (human != null) {
            return ResponseEntity.ok(human);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Human> updateHuman(@PathVariable Long id, @RequestBody Human human) {
        Human updatedHuman = humanService.updateHuman(id, human);
        if (updatedHuman != null) {
            return ResponseEntity.ok(updatedHuman);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHuman(@PathVariable Long id) {
        humanService.deleteHuman(id);
        return ResponseEntity.noContent().build();
    }
}
