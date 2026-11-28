package core_services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.Stint;

public interface StintRepository extends JpaRepository<Stint, Long> {

    List<Stint> findBySessionKeyAndDriverNumberOrderByStintNumber(Integer sessionKey, Integer driverNumber);
}