package uz.pdp.model.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {
        private String name;
    private String description;
    private UUID assigneeId;
    private TaskType type;
    private TaskStatus status;
}
