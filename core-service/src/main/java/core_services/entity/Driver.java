package core_services.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Driver {

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
    public String getNameAcronym() {
        return nameAcronym;
    }
    public void setNameAcronym(String nameAcronym) {
        this.nameAcronym = nameAcronym;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamColour() {
        return teamColour;
    }
    public void setTeamColour(String teamColour) {
        this.teamColour = teamColour;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sessionKey;
    private Integer driverNumber;
    private String nameAcronym;
    private String fullName;
    private String teamName;
    private String teamColour;
}