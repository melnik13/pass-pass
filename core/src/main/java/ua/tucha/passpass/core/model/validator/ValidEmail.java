package ua.tucha.passpass.core.model.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = UserEmailValidator.class)
@Documented
public @interface ValidEmail {
    String message() default "{core.model.validator.EmailValidator.email_invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

