package com.avalon.Annotation;

import java.lang.annotation.*;

/**
 * Created by ouyqy on 2017/9/6.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Message {
    String getLoginName();

    String getPassword();
}
