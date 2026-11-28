package core_services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import core_services.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findBySessionKey(Integer sessionKey);
}