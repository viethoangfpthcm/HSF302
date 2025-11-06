package edu.fuhcm.lapshop.se678968.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email", length = 100, columnDefinition = "nvarchar(100)", nullable = false)
    private String email;
    //String là varchar(), muốn nvarchar() cho tiếng Việt phải độ cột

    @Column(name = "password", length = 50, nullable = false)
    private String password;  //String là varchar(), muốn nvarchar() cho tiếng Việt phải độ cột

    @Column(name = "role", length = 20, nullable = false)
    private String role;

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

}

