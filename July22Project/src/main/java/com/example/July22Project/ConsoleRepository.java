package com.example.July22Project;


import org.hibernate.validator.constraints.URL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Console;
import java.util.List;

public interface ConsoleRepository extends JpaRepository<Consoles, Integer> {

    List<Consoles> findByManufactuerer(String manufacturer);
}
