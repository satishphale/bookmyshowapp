package com.bookmyshow.domain;

import jakarta.persistence.Id;

public class Event {
    @Id
    long id;

    String name;

    String venue;

    String performer;


}
