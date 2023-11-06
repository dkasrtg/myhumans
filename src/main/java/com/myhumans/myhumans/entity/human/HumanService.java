package com.myhumans.myhumans.entity.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {
    @Autowired
    private HumanRepository humanRepository;

    public Human createHuman(Human human) {
        return humanRepository.save(human);
    }

    public List<Human> getAllHumans() {
        return humanRepository.findAll();
    }

    public Human getHumanById(Long id) {
        return humanRepository.findById(id).orElse(null);
    }

    public Human updateHuman(Long id, Human human) {
        if (humanRepository.existsById(id)) {
            human.setId(id);
            return humanRepository.save(human);
        }
        return null;
    }

    public void deleteHuman(Long id) {
        humanRepository.deleteById(id);
    }
}