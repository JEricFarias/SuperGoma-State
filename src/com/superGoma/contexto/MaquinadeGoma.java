package com.superGoma.contexto;

import com.superGoma.estado.ComMoeda;
import com.superGoma.estado.GomaVendida;
import com.superGoma.estado.SemGoma;
import com.superGoma.estado.SemMoeda;
import com.superGoma.estado.State;

public class MaquinadeGoma {
	private ComMoeda comMoeda;
	private SemMoeda semMoeda;
	private GomaVendida gomaVendida;
	private SemGoma semGoma;
	
	private int numeroGoma;
	private State estado;
	
	public MaquinadeGoma(int numeroGoma){
		this.comMoeda = new ComMoeda(this);
		this.semMoeda = new SemMoeda(this);
		this.gomaVendida = new GomaVendida(this);
		this.semGoma = new SemGoma(this);
		
		this.numeroGoma = numeroGoma;
		if(numeroGoma > 0){
			this.estado = semMoeda;
		}
	}
	
	public void inserirMoeda(){
		this.estado.inserirMoeda();
	}
	
	public void ejetarMoeda(){
		this.estado.ejetarMoeda();
	}
	
	public void acionarAlavanca(){
		this.estado.acionarAlavanca();
		entregarGoma();
	}
	
	public void entregarGoma(){
		if(numeroGoma > 0){
			this.estado.entregarGoma();
		}else{
			this.estado = getSemGoma();
		}
	}

	/**
	 * @return the numerodeGoma
	 */
	public int getNumeroGoma() {
		return numeroGoma;
	}

	/**
	 * @param numerodeGoma the numerodeGoma to set
	 */
	public void setNumeroGoma(int numeroGoma) {
		this.numeroGoma = numeroGoma;
	}

	/**
	 * @return the estado
	 */
	public State getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(State estado) {
		this.estado = estado;
	}

	/**
	 * @return the comMoeda
	 */
	public ComMoeda getComMoeda() {
		return comMoeda;
	}

	/**
	 * @return the semMoeda
	 */
	public SemMoeda getSemMoeda() {
		return semMoeda;
	}

	/**
	 * @return the gomaVendida
	 */
	public GomaVendida getGomaVendida() {
		return gomaVendida;
	}

	/**
	 * @return the semGoma
	 */
	public SemGoma getSemGoma() {
		return semGoma;
	}
}
