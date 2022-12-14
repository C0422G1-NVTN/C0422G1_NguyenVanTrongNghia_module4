package com.medical.service.impl;

import com.medical.model.Medical;
import com.medical.repository.IMedicalRepository;
import com.medical.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    private IMedicalRepository iMedicalRepository;

    @Override
    public List<String> gender() {
        return iMedicalRepository.gender();
    }

    @Override
    public List<String> nation() {
        return iMedicalRepository.nation();
    }

    @Override
    public List<String> vehicle() {
        return iMedicalRepository.vehicle();
    }

    @Override
    public List<Integer> day() {
        return iMedicalRepository.day();
    }

    @Override
    public List<Integer> month() {
        return iMedicalRepository.month();
    }

    @Override
    public List<Integer> year() {
        return iMedicalRepository.year();
    }

    @Override
    public void saveMedical(Medical medical) {
        iMedicalRepository.saveMedical(medical);
    }

    @Override
    public List<Medical> findAllMedical() {
        return iMedicalRepository.findAllMedical();
    }

    @Override
    public Medical findId(int id) {
        return iMedicalRepository.findId(id);
    }

    @Override
    public void edit(Medical medical) {
        iMedicalRepository.edit(medical);
    }

    @Override
    public void delete(int id) {
        iMedicalRepository.delete(id);
    }
}
