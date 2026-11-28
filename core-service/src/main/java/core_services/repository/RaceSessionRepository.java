package core_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.RaceSession;

public interface RaceSessionRepository extends JpaRepository<RaceSession, Integer> {
}