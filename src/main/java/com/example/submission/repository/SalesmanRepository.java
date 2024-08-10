package com.example.submission.repository;

import com.example.submission.entities.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesmanRepository extends
        JpaRepository<Salesman, String> {
    List<Salesman> findAllBy(String kw);
}
