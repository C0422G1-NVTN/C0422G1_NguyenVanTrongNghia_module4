package com.music.service.impl;

import com.music.model.Song;
import com.music.repository.ISongRepository;
import com.music.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return findById(id);
    }

    @Override
    public void remove(Song song) {
        iSongRepository.remove(song);
    }
}
