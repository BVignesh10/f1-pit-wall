CREATE TABLE sessions (
    session_key        INTEGER PRIMARY KEY,
    meeting_key        INTEGER NOT NULL,
    session_name       VARCHAR(50) NOT NULL,
    session_type       VARCHAR(50),
    circuit_short_name VARCHAR(100),
    country_name       VARCHAR(100),
    location           VARCHAR(100),
    year               INTEGER NOT NULL,
    date_start         TIMESTAMPTZ,
    date_end           TIMESTAMPTZ
);

CREATE TABLE drivers (
    id            BIGSERIAL PRIMARY KEY,
    session_key   INTEGER NOT NULL REFERENCES sessions (session_key),
    driver_number INTEGER NOT NULL,
    name_acronym  VARCHAR(10),
    full_name     VARCHAR(100),
    team_name     VARCHAR(100),
    team_colour   VARCHAR(10),
    CONSTRAINT uq_drivers_session_number UNIQUE (session_key, driver_number)
);

CREATE TABLE laps (
    id                BIGSERIAL PRIMARY KEY,
    session_key       INTEGER NOT NULL REFERENCES sessions (session_key),
    driver_number     INTEGER NOT NULL,
    lap_number        INTEGER NOT NULL,
    lap_duration      NUMERIC(8, 3),
    duration_sector_1 NUMERIC(8, 3),
    duration_sector_2 NUMERIC(8, 3),
    duration_sector_3 NUMERIC(8, 3),
    is_pit_out_lap    BOOLEAN,
    date_start        TIMESTAMPTZ,
    CONSTRAINT uq_laps_session_driver_lap UNIQUE (session_key, driver_number, lap_number)
);

CREATE TABLE stints (
    id                BIGSERIAL PRIMARY KEY,
    session_key       INTEGER NOT NULL REFERENCES sessions (session_key),
    driver_number     INTEGER NOT NULL,
    stint_number      INTEGER NOT NULL,
    compound          VARCHAR(20),
    lap_start         INTEGER,
    lap_end           INTEGER,
    tyre_age_at_start INTEGER,
    CONSTRAINT uq_stints_session_driver_stint UNIQUE (session_key, driver_number, stint_number)
);

CREATE TABLE pit_stops (
    id            BIGSERIAL PRIMARY KEY,
    session_key   INTEGER NOT NULL REFERENCES sessions (session_key),
    driver_number INTEGER NOT NULL,
    lap_number    INTEGER NOT NULL,
    pit_duration  NUMERIC(8, 3),
    date          TIMESTAMPTZ,
    CONSTRAINT uq_pit_session_driver_lap UNIQUE (session_key, driver_number, lap_number)
);

CREATE TABLE weather_readings (
    id                BIGSERIAL PRIMARY KEY,
    session_key       INTEGER NOT NULL REFERENCES sessions (session_key),
    recorded_at       TIMESTAMPTZ NOT NULL,
    air_temperature   DOUBLE PRECISION,
    track_temperature DOUBLE PRECISION,
    humidity          DOUBLE PRECISION,
    pressure          DOUBLE PRECISION,
    wind_speed        DOUBLE PRECISION,
    wind_direction    INTEGER,
    rainfall          INTEGER,
    CONSTRAINT uq_weather_session_time UNIQUE (session_key, recorded_at)
);