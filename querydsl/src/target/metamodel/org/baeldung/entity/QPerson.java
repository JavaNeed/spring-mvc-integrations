package org.baeldung.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QPerson is a Querydsl query type for Person
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPerson extends EntityPathBase<Person> {

    private static final long serialVersionUID = -1972014868;

    public static final QPerson person = new QPerson("person");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath firstname = createString("firstname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath surname = createString("surname");

    public QPerson(String variable) {
        super(Person.class, forVariable(variable));
    }

    public QPerson(Path<? extends Person> entity) {
        super(entity.getType(), entity.getMetadata());
    }

    public QPerson(PathMetadata<?> metadata) {
        super(Person.class, metadata);
    }

}

