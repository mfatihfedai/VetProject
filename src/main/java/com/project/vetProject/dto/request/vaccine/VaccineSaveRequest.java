package com.project.vetProject.dto.request.vaccine;

import com.project.vetProject.entity.Report;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineSaveRequest {
    @NotNull(message = "Aşı adı boş olamaz")
    private String name;
    @NotNull(message = "Aşı kodu boş olamaz")
    private String code;
    @NotNull(message = "Aşı başlangıç tarihi boş olamaz")
    private LocalDate protectionStrtDate;
    @NotNull(message = "Aşı bitiş tarihi boş olamaz")
    private LocalDate protectionFnshDate;
    private Integer animalId;
    private Report report;
}
