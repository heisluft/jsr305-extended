package de.heisluft.annotation.resources.cleanup;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes a type which can create an obligation for cleanup
 * <br><i>Example:</i> the constructor opens an input stream, which has to be closed by another method.
 * In this case, the constructor would be denoted by the {@link CreatesObligation} annotation and the closing method
 * would be denoted by the {@link DischargesObligation} annotation
 * <br>If the type holding this element defines multiple cleanup obligations each one must be denoted with a string
 * id
 *
 * @see CreatesObligation
 * @see DischargesObligation
 *
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Obligation {
	/**
	 * @return the ids of all obligations existing in this class
	 */
	String[] value() default "";
}