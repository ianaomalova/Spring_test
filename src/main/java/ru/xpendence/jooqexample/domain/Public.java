/*
 * This file is generated by jOOQ.
 */
package ru.xpendence.jooqexample.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.xpendence.jooqexample.domain.tables.Cities;
import ru.xpendence.jooqexample.domain.tables.Countries;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -552101386;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.cities</code>.
     */
    public final Cities CITIES = ru.xpendence.jooqexample.domain.tables.Cities.CITIES;

    /**
     * The table <code>public.countries</code>.
     */
    public final Countries COUNTRIES = ru.xpendence.jooqexample.domain.tables.Countries.COUNTRIES;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CITIES_ID_SEQ,
            Sequences.COUNTRIES_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Cities.CITIES,
            Countries.COUNTRIES);
    }
}
