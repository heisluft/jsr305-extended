package de.heisluft.annotation.nullness.defaults;

import de.heisluft.annotation.meta.TypeQualifierDefault;
import de.heisluft.annotation.nullness.Nullable;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be applied to a package or class to indicate that the fields in that element are nullable by
 * default unless:
 * <ul>
 * <li>There is an explicit nullness annotation
 * <li>A class inherits a field from a superclass (in which case the annotation of the corresponding method in the
 * superclass applies)
 * <li>There is a default field annotation applied to a more tightly nested element.
 * </ul>
 * <p>This annotation implies the same "nullness" as no annotation. However, it is different
 * than having no annotation, as it is inherited and it can override a {@link FieldsAreNonnullByDefault} annotation at
 * an outer scope.
 *
 * @see Nullable
 */
@Documented
@Nullable
@Target({ElementType.TYPE, ElementType.PACKAGE})
@TypeQualifierDefault(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsAreNullableByDefault {}