package core_services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.PitStop;

public interface PitStopRepository extends JpaRepository<PitStop, Long> {

    List<PitStop> findBySessionKeyOrderByLapNumber(Integer sessionKey);
}