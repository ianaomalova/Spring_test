package ru.xpendence.jooqexample.controllers;

import lombok.RequiredArgsConstructor;
import org.jooq.Condition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.xpendence.jooqexample.dto.City;
import ru.xpendence.jooqexample.repository.impl.CityRepository;
import ru.xpendence.jooqexample.repository.impl.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class Controller {
    private final CityRepository cityRepository;
    private final UserRepository userRepository;
    @GetMapping("/get/{str}")
    public List<City> getCities(@PathVariable String str) {
        return cityRepository.findAll();
    }
}
