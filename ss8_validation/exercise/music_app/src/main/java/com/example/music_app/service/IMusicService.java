package com.example.music_app.service;

import com.example.music_app.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMusicService {
    Page<Music> findAll(Pageable pageable);

    void save(Music music);

    Music findById(int id);
}
