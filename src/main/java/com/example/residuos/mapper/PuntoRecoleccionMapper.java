package com.example.residuos.mapper;

import com.example.residuos.dto.*;
import com.example.residuos.entity.PuntoRecoleccion;

public class PuntoRecoleccionMapper {

	public static PuntoRecoleccion toEntity(PuntoRecoleccionCreateDTO dto) {
		return PuntoRecoleccion.builder()
				.nombre(dto.getNombre())
				.direccion(dto.getDireccion())
				.tipoResiduo(dto.getTipoResiduo())
				.horarioDisponible(dto.getHorarioDisponible())
				.activo(dto.isActivo())
				.build();
	}

	public static PuntoRecoleccionResponseDTO toResponse(PuntoRecoleccion entity) {
		return PuntoRecoleccionResponseDTO.builder()
				.id(entity.getId())
				.nombre(entity.getNombre())
				.tipoResiduo(entity.getTipoResiduo())
				.activo(entity.isActivo())
				.build();
	}

	public static void actualizarEntidad(PuntoRecoleccion entity, PuntoRecoleccionCreateDTO dto) {
		entity.setNombre(dto.getNombre());
		entity.setDireccion(dto.getDireccion());
		entity.setTipoResiduo(dto.getTipoResiduo());
		entity.setHorarioDisponible(dto.getHorarioDisponible());
		entity.setActivo(dto.isActivo());
	}

}