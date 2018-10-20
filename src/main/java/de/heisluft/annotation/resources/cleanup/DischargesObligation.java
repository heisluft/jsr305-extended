package de.heisluft.annotation.resources.cleanup;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DischargesObligation {
	String[] value() default "";
}
