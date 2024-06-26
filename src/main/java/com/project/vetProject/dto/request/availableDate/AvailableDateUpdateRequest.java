package com.project.vetProject.dto.request.availableDate;

import com.project.vetProject.entity.Doctor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailableDateUpdateRequest {
    @Positive(message = "ID pozitif olmalı")
    @NotNull(message = "Müsait gün Id boş olamaz")
    private int id;
    @NotNull(message = "Müsait gün tarihi boş olamaz")
    private LocalDate date;
    private Doctor doctor;
}
