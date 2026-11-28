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
@Table(name = "laps")
public class Lap {

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

    public BigDecimal getLapDuration() {
        return lapDuration;
    }

    public void setLapDuration(BigDecimal lapDuration) {
        this.lapDuration = lapDuration;
    }

    public BigDecimal getDurationSector1() {
        return durationSector1;
    }

    public void setDurationSector1(BigDecimal durationSector1) {
        this.durationSector1 = durationSector1;
    }

    public BigDecimal getDurationSector2() {
        return durationSector2;
    }

    public void setDurationSector2(BigDecimal durationSector2) {
        this.durationSector2 = durationSector2;
    }

    public BigDecimal getDurationSector3() {
        return durationSector3;
    }

    public void setDurationSector3(BigDecimal durationSector3) {
        this.durationSector3 = durationSector3;
    }

    public Boolean getPitOutLap() {
        return pitOutLap;
    }

    public void setPitOutLap(Boolean pitOutLap) {
        this.pitOutLap = pitOutLap;
    }

    public OffsetDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(OffsetDateTime dateStart) {
        this.dateStart = dateStart;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sessionKey;
    private Integer driverNumber;
    private Integer lapNumber;
    private BigDecimal lapDuration;

    @Column(name = "duration_sector_1")
    private BigDecimal durationSector1;

    @Column(name = "duration_sector_2")
    private BigDecimal durationSector2;

    @Column(name = "duration_sector_3")
    private BigDecimal durationSector3;

    @Column(name = "is_pit_out_lap")
    private Boolean pitOutLap;

    private OffsetDateTime dateStart;
}