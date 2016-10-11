package com.superGoma.estado;

import com.superGoma.contexto.MaquinadeGoma;

public class GomaVendida implements State{
	MaquinadeGoma maquinadeGoma;
	
	public GomaVendida(MaquinadeGoma maquinadeGoma){
		this.maquinadeGoma = maquinadeGoma;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Por favor espere um instante, a goma esta sendo entrege!");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Ja entregamos a goma, ela não pode mais ser devolvida!");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Girar duas vezes não lhe dará duas gomas. Espere um momento, ja estamos entregando sua goma!");
	}

	@Override
	public void entregarGoma() {
		maquinadeGoma.setNumeroGoma(maquinadeGoma.getNumeroGoma() - 1);
		System.out.println("Goma entregue!");
		maquinadeGoma.setEstado(maquinadeGoma.getSemMoeda());
	}
	
	

}
