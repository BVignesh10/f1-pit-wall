package core_services.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stints")
public class Stint {

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
    public Integer getStintNumber() {
        return stintNumber;
    }
    public void setStintNumber(Integer stintNumber) {
        this.stintNumber = stintNumber;
    }
    public String getCompound() {
        return compound;
    }
    public void setCompound(String compound) {
        this.compound = compound;
    }
    public Integer getLapStart() {
        return lapStart;
    }
    public void setLapStart(Integer lapStart) {
        this.lapStart = lapStart;
    }
    public Integer getLapEnd() {
        return lapEnd;
    }
    public void setLapEnd(Integer lapEnd) {
        this.lapEnd = lapEnd;
    }
    public Integer getTyreAgeAtStart() {
        return tyreAgeAtStart;
    }
    public void setTyreAgeAtStart(Integer tyreAgeAtStart) {
        this.tyreAgeAtStart = tyreAgeAtStart;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sessionKey;
    private Integer driverNumber;
    private Integer stintNumber;
    private String compound;
    private Integer lapStart;
    private Integer lapEnd;
    private Integer tyreAgeAtStart;
}