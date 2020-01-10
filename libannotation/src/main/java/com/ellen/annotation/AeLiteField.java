package com.ellen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface AeLiteField {
    String fieldName() default "";
    String fieldType() default "";
    boolean isCanNull() default true;
    boolean isPrimaryKey() default false;
}
