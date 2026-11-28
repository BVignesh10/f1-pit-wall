package core_services.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import core_services.entity.RaceSession;
import core_services.repository.RaceSessionRepository;

@RestController
@RequestMapping("/api/sessions")
public class RaceSessionController {

    private final RaceSessionRepository repository;

    public RaceSessionController(RaceSessionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RaceSession> getAll() {
        return repository.findAll();
    }
}