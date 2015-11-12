package com.huan.luo.auth;

import java.lang.annotation.*;

/**
 * Created by luohuan on 15/11/12.
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthPassport {
    boolean validate() default true;
}
