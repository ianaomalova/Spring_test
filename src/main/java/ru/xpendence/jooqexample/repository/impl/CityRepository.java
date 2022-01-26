package ru.xpendence.jooqexample.repository.impl;

import lombok.RequiredArgsConstructor;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import ru.xpendence.jooqexample.dto.City;
import ru.xpendence.jooqexample.domain.tables.Cities;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 15.02.2020
 */
@Repository
@RequiredArgsConstructor
public class CityRepository {

    private final DSLContext dsl;

    public City insert(City city) {
        return dsl.insertInto(Cities.CITIES)
                .set(dsl.newRecord(Cities.CITIES, city))
                .returning()
                .fetchOne()
                .into(City.class);
    }

    public City update(City city) {
        return dsl.update(Cities.CITIES)
                .set(dsl.newRecord(Cities.CITIES, city))
                .where(Cities.CITIES.ID.eq(city.getId()))
                .returning()
                .fetchOne()
                .into(City.class);
    }

    public City find(Long id) {
        return dsl.selectFrom(Cities.CITIES)
                .where(Cities.CITIES.ID.eq(id))
                .fetchAny()
                .into(City.class);
    }

    public List<City> findAll() {
        return dsl.selectFrom(Cities.CITIES)
                .fetch()
                .into(City.class).stream().collect(Collectors.toList());
    }

}
