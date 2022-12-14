package com.example.case_study_module4.service.facility;

import com.example.case_study_module4.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);
    void add(Facility facility);
    void update(Facility facility);
    void delete(int id);
    Facility findById(int id);
    Page<Facility>search(String name, String facilityTypeName, Pageable pageable);
}
