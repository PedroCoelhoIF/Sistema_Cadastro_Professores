package com.escola.dto;


import jakarta.validation.constraints.NotBlank;

public record CategoriaDTO(
        @NotBlank String nome
) {

}