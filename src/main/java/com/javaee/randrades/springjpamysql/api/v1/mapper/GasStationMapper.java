package com.javaee.randrades.springjpamysql.api.v1.mapper;

import org.springframework.stereotype.Component;

import com.javaee.randrades.springjpamysql.api.v1.model.GasStationDTO;
import com.javaee.randrades.springjpamysql.domain.GasStation;

@Component
public class GasStationMapper {
	public GasStationDTO gasStationToGasStationDTO(GasStation gasStation) {
		final GasStationDTO gasStationDTO = new GasStationDTO();
		gasStationDTO.setId(gasStation.getId());
		gasStationDTO.setName(gasStation.getName());
		return gasStationDTO;
	}

    public GasStation gasStationDTOToGasStation(GasStationDTO gasStationDTO) {
    	final GasStation gasStation = new GasStation();
		gasStation.setId(gasStationDTO.getId());
		gasStation.setName(gasStationDTO.getName());
		return gasStation;
    }
}