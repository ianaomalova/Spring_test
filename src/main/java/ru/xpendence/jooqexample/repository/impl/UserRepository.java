package ru.xpendence.jooqexample.repository.impl;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import ru.xpendence.jooqexample.dto.City;
import ru.xpendence.jooqexample.dto.User;
import ru.xpendence.jooqexample.domain.tables.Cities;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final DSLContext dsl;

    public City find(Long id) {
        return dsl.selectFrom(Cities.CITIES)
                .where(Cities.CITIES.ID.eq(id))
                .fetchAny()
                .into(City.class);
    }
}
