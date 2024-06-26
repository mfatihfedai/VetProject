package com.project.vetProject.dto.request.appointment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentSaveRequest {
    @NotNull(message = "Randevu tarihi boş olamaz")
    private LocalDateTime dateTime;

    @Positive(message = "Hayvan ID pozitif olmalı")
    @NotNull(message = "Hayvan ID boş olamaz")
    private Integer animalId;

    @Positive(message = "Doktor ID pozitif olmalı")
    @NotNull(message = "Doktor ID boş olamaz")
    private Integer doctorId;
}
