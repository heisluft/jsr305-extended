package de.heisluft.annotation.resources.cleanup;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * A method or constructor within a type that creates a resource in need of cleanup. The resource is cleaned up by
 * invoking a method annotated with {@link DischargesObligation}.
 * <br>If the type holding this method defines multiple cleanup obligations each
 */
@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface CreatesObligation {
	String[] value() default "";
}
