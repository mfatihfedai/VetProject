package com.project.vetProject.dto.response.animal;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalResponse {
    private int id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private String color;
    private LocalDate birthday;
    private Integer customerId;
//    private int page;
//    private boolean hasNextPage;
}
