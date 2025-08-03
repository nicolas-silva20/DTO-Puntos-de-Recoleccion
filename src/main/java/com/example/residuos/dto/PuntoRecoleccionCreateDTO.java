package com.example.residuos.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PuntoRecoleccionCreateDTO {
	private String nombre;
	private String direccion;
	private String tipoResiduo;
	private String horarioDisponible;
	private boolean activo;
}