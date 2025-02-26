package ru.practicum.main.user.dto;

import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserShortDto { // Добавил
    @NotNull
    private Long id;
    @NotEmpty
    private String name;
}
