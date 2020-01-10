package com.ellen.aelitelibrary.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface AeLiteField {
    String fieldName();
    String fieldType();
    boolean isNull();
    boolean isPrimaryKey();
}
