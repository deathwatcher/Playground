package org.enafynn.playgorund.util.validation.result;

import java.util.Optional;

final class ValidationSupport {

    private static final ValidationResult valid = new ValidationResult() {
        public boolean isValid() {
            return true;
        }

        public Optional<String> getReason() {
            return Optional.empty();
        }
    };

    private ValidationSupport() {
        //empty Constructor
    }

    static ValidationResult valid() {
        return valid;
    }
}

