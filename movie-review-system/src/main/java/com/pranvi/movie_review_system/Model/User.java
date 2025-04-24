package com.pranvi.movie_review_system.Model;




import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false, unique = true)
    private String UserName;

    @Column(nullable = false)
    private String Password;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


}
