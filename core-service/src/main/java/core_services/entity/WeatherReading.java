package core_services.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather_readings")
public class WeatherReading {

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
    public OffsetDateTime getRecordedAt() {
        return recordedAt;
    }
    public void setRecordedAt(OffsetDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }
    public Double getAirTemperature() {
        return airTemperature;
    }
    public void setAirTemperature(Double airTemperature) {
        this.airTemperature = airTemperature;
    }
    public Double getTrackTemperature() {
        return trackTemperature;
    }
    public void setTrackTemperature(Double trackTemperature) {
        this.trackTemperature = trackTemperature;
    }
    public Double getHumidity() {
        return humidity;
    }
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }
    public Double getPressure() {
        return pressure;
    }
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
    public Double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public Integer getWindDirection() {
        return windDirection;
    }
    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }
    public Integer getRainfall() {
        return rainfall;
    }
    public void setRainfall(Integer rainfall) {
        this.rainfall = rainfall;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sessionKey;
    private OffsetDateTime recordedAt;
    private Double airTemperature;
    private Double trackTemperature;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Integer windDirection;
    private Integer rainfall;
}