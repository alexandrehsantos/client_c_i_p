package br.com.projecti.cip.cliente;

public class TestServicoWeb {

	public static void main(String[] args) {

		ControleGarantia controleGarantia = new SCGService().getControleGarantia();
		SCGRequest scgRequest = new SCGRequest();
		scgRequest.setRequest("xxx".getBytes());
		scgRequest.setTimeOut(30);
		controleGarantia.executeOperation(scgRequest);

	}

}
