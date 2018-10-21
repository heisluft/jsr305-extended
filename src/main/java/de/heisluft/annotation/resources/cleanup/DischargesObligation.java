package de.heisluft.annotation.resources.cleanup;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes a method within a type that cleans up a resource, discharging an obligation. The method <i>can</i> fail if
 * invoked without prior invocation of its respective {@link CreatesObligation} element.
 * <br>If the type holding this element defines multiple cleanup obligations each one must be denoted with a string
 * id
 *
 * @see Obligation
 * @see CreatesObligation
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DischargesObligation {
	/**
	 * @return the ids of all obligations discharged by this method
	 */
	String[] value() default "";
}
