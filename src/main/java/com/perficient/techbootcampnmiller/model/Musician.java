package com.perficient.techbootcampnmiller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

public class Musician {

    private final UUID id;
    private final String first_name;
    private final String last_name;
    private final String birthdate;

    public Musician(@JsonProperty("id") UUID id, @JsonProperty("first_name") String first_name,
                    @JsonProperty("last_name") String last_name, @JsonProperty("birthdate") String birthdate) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate = birthdate;
    }

    public UUID getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
