package com.sandwich.repository.impl;

import com.sandwich.repository.ISpiceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpiceRepository implements ISpiceRepository {
    private static List<String> spiceList = new ArrayList<>();

    static {
        spiceList.add("Lettuce");
        spiceList.add("Tomato");
        spiceList.add("Mustard");
        spiceList.add("Sprouts");
    }


    @Override
    public List<String> findAllSpice() {
        return spiceList;
    }
}
