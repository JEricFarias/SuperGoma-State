package com.superGoma.estado;

import com.superGoma.contexto.MaquinadeGoma;

public class ComMoeda implements State{
	
	MaquinadeGoma maquinadeGoma;
	
	public ComMoeda(MaquinadeGoma maquinadeGoma){
		this.maquinadeGoma = maquinadeGoma;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Você não pode inserir mais de uma moeda por vez!");
	}

	@Override
	public void ejetarMoeda() {
		maquinadeGoma.setEstado(maquinadeGoma.getSemMoeda());
	}

	@Override
	public void acionarAlavanca() {
		maquinadeGoma.setEstado(maquinadeGoma.getGomaVendida());
	}

	@Override
	public void entregarGoma() {
		System.out.println("Gire a alavanca para pegar a goma");
	}

}
