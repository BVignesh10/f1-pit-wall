package core_services.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sessions")
public class RaceSession {

    public Integer getSessionKey() {
        return sessionKey;
    }
    public void setSessionKey(Integer sessionKey) {
        this.sessionKey = sessionKey;
    }
    public Integer getMeetingKey() {
        return meetingKey;
    }
    public void setMeetingKey(Integer meetingKey) {
        this.meetingKey = meetingKey;
    }
    public String getSessionName() {
        return sessionName;
    }
    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }
    public String getSessionType() {
        return sessionType;
    }
    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }
    public String getCircuitShortName() {
        return circuitShortName;
    }
    public void setCircuitShortName(String circuitShortName) {
        this.circuitShortName = circuitShortName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public OffsetDateTime getDateStart() {
        return dateStart;
    }
    public void setDateStart(OffsetDateTime dateStart) {
        this.dateStart = dateStart;
    }
    public OffsetDateTime getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(OffsetDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }
    @Id
    private Integer sessionKey;

    private Integer meetingKey;
    private String sessionName;
    private String sessionType;
    private String circuitShortName;
    private String countryName;
    private String location;
    private Integer year;
    private OffsetDateTime dateStart;
    private OffsetDateTime dateEnd;
}