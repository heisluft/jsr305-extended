package de.heisluft.annotation.nullness.defaults;

import de.heisluft.annotation.meta.TypeQualifierDefault;
import de.heisluft.annotation.nullness.Nullable;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be applied to a package, class or method to indicate that the methods in that element can return
 * null by default unless:
 * <ul>
 * <li>There is an explicit nullness annotation
 * <li>The method overrides a method in a superclass (in which case the annotation of the corresponding method in the
 * superclass applies)
 * <li>There is a default return annotation applied to a more tightly nested element.
 * </ul>
 * <br>This annotation implies the same "nullness" as no annotation. However, it is different than having no
 * annotation, as it is inherited and it can override a {@link ReturnValuesAreNonnullByDefault} annotation at an outer scope.
 */
@Documented
@Nullable
@Target({ElementType.TYPE, ElementType.PACKAGE, ElementType.METHOD})
@TypeQualifierDefault(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReturnValuesAreNullableByDefault {}