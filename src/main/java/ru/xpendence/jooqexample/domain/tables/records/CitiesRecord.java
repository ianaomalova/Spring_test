/*
 * This file is generated by jOOQ.
 */
package ru.xpendence.jooqexample.domain.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.xpendence.jooqexample.domain.tables.Cities;


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
public class CitiesRecord extends UpdatableRecordImpl<CitiesRecord> implements Record3<Long, Long, String> {

    private static final long serialVersionUID = 902198969;

    /**
     * Setter for <code>public.cities.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cities.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.cities.country_id</code>.
     */
    public void setCountryId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cities.country_id</code>.
     */
    public Long getCountryId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.cities.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.cities.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Cities.CITIES.ID;
    }

    @Override
    public Field<Long> field2() {
        return Cities.CITIES.COUNTRY_ID;
    }

    @Override
    public Field<String> field3() {
        return Cities.CITIES.NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCountryId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCountryId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public CitiesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CitiesRecord value2(Long value) {
        setCountryId(value);
        return this;
    }

    @Override
    public CitiesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public CitiesRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CitiesRecord
     */
    public CitiesRecord() {
        super(Cities.CITIES);
    }

    /**
     * Create a detached, initialised CitiesRecord
     */
    public CitiesRecord(Long id, Long countryId, String name) {
        super(Cities.CITIES);

        set(0, id);
        set(1, countryId);
        set(2, name);
    }
}
