package com.xym.spring4;

import java.lang.annotation.*;

/**
 * @author xym
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
