package uk.co.terminological.jsr223;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Methods marekd by this annotation will be included in the R library api.
 * In the R API methods must all have different names so method or constructor overloading is not 
 * supported. Both static and non-static methods are supported allowing for factory style constructors.
 *  
 * examples field is used to populate .Rd files
 * @author terminological
 *
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RMethod {

	String[] examples() default {};
	
}
