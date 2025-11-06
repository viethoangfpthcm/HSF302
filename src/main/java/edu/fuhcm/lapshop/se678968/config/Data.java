package edu.fuhcm.lapshop.se678968.config;

import edu.fuhcm.lapshop.se678968.entity.Computer;
import edu.fuhcm.lapshop.se678968.entity.Manufacturer;
import edu.fuhcm.lapshop.se678968.entity.User;
import edu.fuhcm.lapshop.se678968.service.ComputerService;
import edu.fuhcm.lapshop.se678968.service.ManuService;
import edu.fuhcm.lapshop.se678968.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Data implements CommandLineRunner {
    @Autowired
    UserService userService;
@Autowired
ManuService manuService;
@Autowired
ComputerService computerService;
    @Override
    public void run(String... args) throws Exception {
        userService.createUser(new User( "admin@laptopshop.com", "@1", "Admin"));
        userService.createUser(new User( "staff@laptopshop.com", "@2", "Staff"));
        userService.createUser(new User( "member@laptopshop.com", "@3", "Member"));

        Manufacturer Manufacturer = new Manufacturer("Dell","USA" );
        Manufacturer Manufacturer1 = new Manufacturer("Lenovo","China" );
        Manufacturer Manufacturer2 = new Manufacturer("HP","USA" );
        manuService.createManu(Manufacturer);
        manuService.createManu(Manufacturer1);
        manuService.createManu(Manufacturer2);

        computerService.createComputer(new Computer("XPS 13", "Ultrabook", 2023, 1299.99,Manufacturer));
        computerService.createComputer(new Computer("ThinkPad X1 Carbon", "Business Laptop", 2023, 1499.99,Manufacturer1));
        computerService.createComputer(new Computer("Pavilion 15", "Consumer Laptop", 2022, 699.99,Manufacturer2));
        computerService.createComputer(new Computer("Inspiron 14", "Budget Laptop", 2023, 549.99,Manufacturer));

    }


}
