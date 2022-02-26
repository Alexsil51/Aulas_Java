package br.modelo;

public interface CampoObservador {
	
//	@FunctionalInterface
	public void eventoOcorreu(Campo campo, CampoEvento evento);

}
