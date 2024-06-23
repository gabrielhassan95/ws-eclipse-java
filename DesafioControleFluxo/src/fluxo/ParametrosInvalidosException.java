package fluxo;

public class ParametrosInvalidosException extends Exception {
	
	int parametroUm;
	int parametroDois;

	public ParametrosInvalidosException(int parametroUm, int parametroDois) {
		super();
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}

	@Override
	public String toString() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
		
	}


