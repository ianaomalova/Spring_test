/*
 * This file is generated by jOOQ.
 */
package ru.xpendence.jooqexample.domain;


import javax.annotation.processing.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.cities_id_seq</code>
     */
    public static final Sequence<Long> CITIES_ID_SEQ = new SequenceImpl<Long>("cities_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.countries_id_seq</code>
     */
    public static final Sequence<Long> COUNTRIES_ID_SEQ = new SequenceImpl<Long>("countries_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
