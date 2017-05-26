package org.enafynn.playgorund.util.validation.result;

import java.util.Optional;

public interface ValidationResult {

    boolean isValid();

    Optional<String> getReason();

    static ValidationResult valid() {
        return ValidationSupport.valid();
    }

    static ValidationResult invalid(String reason) {
        return new Invalid(reason);
    }
}

