package exception;

import uml.Client;

public class DuplicatedException extends ClientException{
	
	/**
	 default serial version
	 */
	private static final long serialVersionUID = 1L;

	public DuplicatedException(Client c) {
		super(c);
	}
	
	public String getMessage() {
		return "El cliente con el código" + client.getCodigoCliente()+ "" + client.getNombreCliente() + " ya existe.";
	}

}
