package com.perficient.techbootcampnmiller.dao;

import com.perficient.techbootcampnmiller.model.Musician;

import java.util.List;
import java.util.UUID;

public interface MusicianDao {

    int insertMusician(UUID id, Musician musician);

    // Create random UUID number
    default int insertMusician(Musician musician) {
        UUID id = UUID.randomUUID();
        return insertMusician(id, musician);
    }
    List<Musician> selectAllMusician();
}
