package com.superGoma.estado;

import com.superGoma.contexto.MaquinadeGoma;

public class SemMoeda implements State{
	
	MaquinadeGoma maquinadeGoma;
	
	public SemMoeda(MaquinadeGoma maquinadeMoeda){
		this.maquinadeGoma = maquinadeMoeda;
	}

	@Override
	public void inserirMoeda() {
		maquinadeGoma.setEstado(maquinadeGoma.getComMoeda());
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Voc� n�o inseriu nem uma moeda!");		
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("N�o podemos vender sem pagamento, ensira alguma moeda");
	}

	@Override
	public void entregarGoma() {
		System.out.println("Ensira a moeda e acione a alavanca para pegar uma goma");
	}

}
