package core_services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.WeatherReading;

public interface WeatherReadingRepository extends JpaRepository<WeatherReading, Long> {

    List<WeatherReading> findBySessionKeyOrderByRecordedAt(Integer sessionKey);
}