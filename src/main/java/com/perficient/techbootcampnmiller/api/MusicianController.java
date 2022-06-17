package com.perficient.techbootcampnmiller.api;

import com.perficient.techbootcampnmiller.model.Musician;
import com.perficient.techbootcampnmiller.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/musician")
@RestController
public class MusicianController {

    private final MusicianService musicianService;

    @Autowired
    public MusicianController(MusicianService musicianService) {
        this.musicianService = musicianService;
    }

    @PostMapping
    public void addMusician(@RequestBody Musician musician) {
        musicianService.addMusician(musician);
    }

    @GetMapping
    public List<Musician> getAllMusician() {
        return musicianService.getAllMusician();
    }
}
