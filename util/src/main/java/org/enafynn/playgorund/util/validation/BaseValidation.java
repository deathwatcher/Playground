package org.enafynn.playgorund.util.validation;

import org.enafynn.playgorund.util.validation.result.ValidationResult;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.enafynn.playgorund.util.validation.result.ValidationResult.invalid;
import static org.enafynn.playgorund.util.validation.result.ValidationResult.valid;


public interface BaseValidation<T> extends Function<T, ValidationResult> {

    default BaseValidation<T> and(BaseValidation<T> other) {
        return input -> {
            ValidationResult result = this.apply(input);
            return result.isValid() ? other.apply(input) : result;
        };
    }

    default BaseValidation<T> all(BaseValidation<T>... validations){
        return request -> {
            String reasons = Arrays.stream(validations)
                                   .map(v -> v.apply(request))
                                   .filter(r -> !r.isValid())
                                   .map(r -> r.getReason().get())
                                   .collect(Collectors.joining("\n"));
            return reasons.isEmpty()?valid():invalid(reasons);
        };
    }

    default BaseValidation<T> holds(Predicate<T> p, String message) {
        return input -> p.test(input) ? valid() : invalid(message);
    }

}
