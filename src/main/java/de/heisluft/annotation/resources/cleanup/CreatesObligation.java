package de.heisluft.annotation.resources.cleanup;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes a method or constructor within a type that creates a resource in need of cleanup. The resource is cleaned up
 * by invoking a method annotated with {@link DischargesObligation}.
 * <br>If the type holding this element defines multiple cleanup obligations each one must be denoted with a string
 * id
 *
 * @see Obligation
 * @see DischargesObligation
 */
@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatesObligation {

	/**
	 * @return the ids of all obligations created by this element
	 */
	String[] value() default "";
}
