package com.bookmyshow.domain;

import jakarta.persistence.Id;

public class User {
    @Id
    long id;

    String name;

    String password;

    String address;

}
