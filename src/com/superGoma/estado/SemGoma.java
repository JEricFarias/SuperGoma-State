package com.superGoma.estado;

import com.superGoma.contexto.MaquinadeGoma;

public class SemGoma implements State{

	MaquinadeGoma maquinadeGoma;
	
	public SemGoma(MaquinadeGoma maquinadeGoma){
		this.maquinadeGoma = maquinadeGoma;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Desculpe!, mas não há gomas no momento!");
		
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Não há gomas no momento, enquanto não existir gomas não aceitamos dinheiro por isso não podemos devolver nem um");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Estamos sem goma!");
	}

	@Override
	public void entregarGoma() {
		System.out.println("Não temos goma para ser entrege");
	}
}
