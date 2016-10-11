package com.superGoma.estado;

import com.superGoma.contexto.MaquinadeGoma;

public class SemGoma implements State{

	MaquinadeGoma maquinadeGoma;
	
	public SemGoma(MaquinadeGoma maquinadeGoma){
		this.maquinadeGoma = maquinadeGoma;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Desculpe!, mas n�o h� gomas no momento!");
		
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("N�o h� gomas no momento, enquanto n�o existir gomas n�o aceitamos dinheiro por isso n�o podemos devolver nem um");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Estamos sem goma!");
	}

	@Override
	public void entregarGoma() {
		System.out.println("N�o temos goma para ser entrege");
	}
}
