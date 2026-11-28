package core_services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.Lap;

public interface LapRepository extends JpaRepository<Lap, Long> {

    List<Lap> findBySessionKeyAndDriverNumberOrderByLapNumber(Integer sessionKey, Integer driverNumber);
}