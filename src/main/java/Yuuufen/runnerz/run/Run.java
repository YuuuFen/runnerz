package Yuuufen.runnerz.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        @NotEmpty @NotNull Integer id,
        @NotEmpty String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive Integer kilometers,
        Location location
) {

    public Run {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        if (startedOn == null || completedOn == null) {
            throw new IllegalArgumentException("Start and completion times must not be null");
        }
        if (!completedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Start time " + startedOn +
                    " must be before completion time " + completedOn);
        }
    }
}
