package com.example.residuos.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PuntoRecoleccionResponseDTO {
	private Long id;
	private String nombre;
	private String tipoResiduo;
	private boolean activo;
}