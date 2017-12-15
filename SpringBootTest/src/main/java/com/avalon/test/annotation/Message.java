package com.avalon.test.annotation;

import java.lang.annotation.*;

/**
 * @Author ouyqy
 * 2017/12/15 10:41
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Message {
    String value() default "value";

    String name() default "name";
}
