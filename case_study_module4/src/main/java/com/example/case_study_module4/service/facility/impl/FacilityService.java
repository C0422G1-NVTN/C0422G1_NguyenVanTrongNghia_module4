package com.example.case_study_module4.service.facility.impl;

import com.example.case_study_module4.model.facility.Facility;
import com.example.case_study_module4.repository.facility.IFacilityRepository;
import com.example.case_study_module4.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Facility findById(int id) {
        return null;
    }

    @Override
    public Page<Facility> search(String name, String facilityTypeName, Pageable pageable) {
        return null;
    }
}
