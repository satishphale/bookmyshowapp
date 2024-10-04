package com.bookmyshow.domain;

import jakarta.persistence.Id;

public class Ticket {
    @Id
    long id;

    Event event;

    boolean isBooked;

    double price;

    User bookedBy;
}
