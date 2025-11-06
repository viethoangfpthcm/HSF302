package edu.fuhcm.lapshop.se678968.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "manufacturers")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private Integer id;

    @Column(name = "manufacturer_name",unique = true, nullable = false, columnDefinition = "varchar(100)")
    private String name;

    @Column(name = "country", columnDefinition = "nvarchar(100)", nullable = false)
    private String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
