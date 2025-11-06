package edu.fuhcm.lapshop.se678968.service.impl;

import edu.fuhcm.lapshop.se678968.entity.Manufacturer;
import edu.fuhcm.lapshop.se678968.repository.ManuRepository;
import edu.fuhcm.lapshop.se678968.service.ManuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManuServiceImpl implements ManuService {
    @Autowired
    ManuRepository manuRepository;
    @Override
    public void createManu(Manufacturer manufacturer) {
        manuRepository.save(manufacturer);
    }

    @Override
    public List<Manufacturer> getManuList() {
        return manuRepository.findAll();
    }
}
