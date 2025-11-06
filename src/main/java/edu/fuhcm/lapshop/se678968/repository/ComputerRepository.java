package edu.fuhcm.lapshop.se678968.repository;

import edu.fuhcm.lapshop.se678968.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Integer>
{

    boolean existsByModel(String model);
}
