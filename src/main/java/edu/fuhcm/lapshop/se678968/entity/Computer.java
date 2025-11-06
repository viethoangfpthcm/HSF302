package edu.fuhcm.lapshop.se678968.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter

@NoArgsConstructor
@Table(name = "computers")
public class Computer {
    @Id
    @Column(name = "computer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "computer_model", nullable = false)
    @NotBlank(message = "The model is required")
    @NotNull(message = "The model is required")
    @Size(min = 5, max = 50, message = "The model between 5 to 50")
    private String model;

    @Column(name = "type", nullable = false)
    @NotBlank(message = "The type is required")
    @NotNull(message = "The type is required")
    private String type;

    @Min(value = 1990, message = "in range 1990 - 2025")
    @Column(name = "production_year")
    @Max(value = 2025, message = "in range 1990 - 2025")
    private int year;

    @Column(name = "price", precision = 10)
    @DecimalMin(value = "0.0", inclusive = false)
    @Min(value = 100, message = "price must be more than 100")
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;

    public Computer(String model, String type, int year, double price, Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.type = type;
        this.model = model;
    }


}
