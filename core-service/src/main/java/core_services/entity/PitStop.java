package core_services.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pit_stops")
public class PitStop {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(Integer sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Integer getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(Integer driverNumber) {
        this.driverNumber = driverNumber;
    }

    public Integer getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(Integer lapNumber) {
        this.lapNumber = lapNumber;
    }

    public BigDecimal getPitDuration() {
        return pitDuration;
    }

    public void setPitDuration(BigDecimal pitDuration) {
        this.pitDuration = pitDuration;
    }

    public OffsetDateTime getPitTime() {
        return pitTime;
    }

    public void setPitTime(OffsetDateTime pitTime) {
        this.pitTime = pitTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sessionKey;
    private Integer driverNumber;
    private Integer lapNumber;
    private BigDecimal pitDuration;

    @Column(name = "date")
    private OffsetDateTime pitTime;
}