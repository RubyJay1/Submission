package com.example.submission.entities;

import jakarta.persistence.Id;

import java.util.Date;

public class Salesman {

    @Id
    private int id;
    private Double amount;
    private Date dot;
    private String item;
    private String name;

}
