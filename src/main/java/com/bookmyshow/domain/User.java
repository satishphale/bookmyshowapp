package com.bookmyshow.domain;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "address", nullable = false)
    String address;

}
