package ru.practicum.main.compilation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.main.event.dto.EventDto;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompilationShortDto {

    private List<EventDto> events;

    private Long id;

    private Boolean pinned;

    private String title;


}
