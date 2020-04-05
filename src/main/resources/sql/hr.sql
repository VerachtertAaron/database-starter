CREATE SCHEMA IF NOT EXISTS hr;

--SET search_path TO HR;
CREATE TABLE IF NOT EXISTS hr.regions (
    -- column_name  TYPE        column_constraint,
    region_id       INTEGER     PRIMARY KEY,
    region_name     VARCHAR(25)
);

CREATE TABLE IF NOT EXISTS HR.countries (
    country_id      CHAR(2)     PRIMARY KEY,
    country_name    VARCHAR(40),
    region_id       INTEGER,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);