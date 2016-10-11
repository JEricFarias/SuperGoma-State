package com.superGoma.teste;

import com.superGoma.contexto.MaquinadeGoma;

public class Teste {

	public static void main(String args[]){
		MaquinadeGoma m = new MaquinadeGoma(5);
		
		// quando tudo da ok
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		// quando inserimos e ejetamos a moera corretamente
		m.inserirMoeda();
		m.ejetarMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		// quando tudo da ok
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
	}
	
}
