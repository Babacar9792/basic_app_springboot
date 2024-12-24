package com.belli_babs.basic_app.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserDto {

    @NotNull(message = "Le nom d'utilisateur est obligatoire")
    @Min(value = 6, message = "Le username doit avoir au minimum 6 caractères")
    private String username;
    @NotNull(message = "Le mot de passe est obligatoire")
    @Min(value = 6, message = "Le mot de passe est obligatoire et doit comporter au mons 6 caracteres")
    private String password;
}
