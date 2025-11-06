package edu.fuhcm.lapshop.se678968.service.impl;

import edu.fuhcm.lapshop.se678968.entity.Computer;
import edu.fuhcm.lapshop.se678968.repository.ComputerRepository;
import edu.fuhcm.lapshop.se678968.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    @Override
    public void createComputer(Computer computer) {
        if (computerRepository.existsByModel(computer.getModel())) {
            throw new IllegalStateException("computer already exists");
        }
        computerRepository.save(computer);
    }

    @Override
    public List<Computer> getComputers() {
        return computerRepository.findAll();
    }


    @Override
    public void deleteComputer(Computer computer) {
        computerRepository.delete(computer);
    }

    @Override
    public Computer getComputer(Integer id) {
        return computerRepository.findById(id).get();
    }

    @Override
    public void updateComputer(Computer computer) {
        computerRepository.save(computer);
    }


}
