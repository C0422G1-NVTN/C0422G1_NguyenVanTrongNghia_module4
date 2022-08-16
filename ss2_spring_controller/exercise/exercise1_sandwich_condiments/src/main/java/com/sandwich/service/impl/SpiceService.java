package com.sandwich.service.impl;

import com.sandwich.repository.ISpiceRepository;
import com.sandwich.service.ISpiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpiceService implements ISpiceService {

    @Autowired
    private ISpiceRepository iSpiceRepository;

    @Override
    public List<String> findAllSpice() {
        return iSpiceRepository.findAllSpice();
    }
}
