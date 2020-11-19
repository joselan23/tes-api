package com.escalab.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escalab.app.service.EquipoService;
import com.escalab.app.service.PruebaService;

public class PruebaServiceImpl implements PruebaService{
	
	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	public void setEquipoService(EquipoService equipoService) {
		this.equipoService = equipoService;
	}

	
	@Autowired
	public PruebaServiceImpl(EquipoService equipoService) {
		super();
		this.equipoService = equipoService;
	}


	@Override
	public String getSaludo() {
		// TODO Auto-generated method stub
		String saludo = equipoService.saludoEquipo();
		return saludo;
	}
}
