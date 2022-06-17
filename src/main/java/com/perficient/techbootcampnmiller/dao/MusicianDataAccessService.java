package com.perficient.techbootcampnmiller.dao;

import com.perficient.techbootcampnmiller.model.Musician;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("musicianDao")
public class MusicianDataAccessService implements MusicianDao {

    private static List<Musician> DB = new ArrayList<>();

    @Override
    public int insertMusician(UUID id, Musician musician) {
        DB.add(new Musician(id, musician.getFirst_name(), musician.getLast_name(), musician.getBirthdate()));
        return 1;
    }

    @Override
    public List<Musician> selectAllMusician() {
        return DB;
    }
}
