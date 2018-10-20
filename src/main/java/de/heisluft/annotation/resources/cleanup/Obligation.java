package de.heisluft.annotation.resources.cleanup;

public @interface Obligation {
	/**
	 *
	 * @return the names of all obligations created by this class
	 */
	String[] value() default "";
}