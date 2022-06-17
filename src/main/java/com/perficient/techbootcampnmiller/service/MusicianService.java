package com.perficient.techbootcampnmiller.service;

import com.perficient.techbootcampnmiller.dao.MusicianDao;
import com.perficient.techbootcampnmiller.model.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicianService {
    private final MusicianDao musicianDao;

    @Autowired
    public MusicianService(@Qualifier("musicianDao") MusicianDao musicianDao) {
        this.musicianDao = musicianDao;
    }
    public int addMusician(Musician musician) {
        return musicianDao.insertMusician(musician);
    }

    public List<Musician> getAllMusician() {
        return musicianDao.selectAllMusician();
    }
}
