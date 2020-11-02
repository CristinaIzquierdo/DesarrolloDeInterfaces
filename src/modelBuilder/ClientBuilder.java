package modelBuilder;

import exception.DuplicatedItemException;
import model.ClientDAO;
import uml.Client;

public class ClientBuilder {
	
	public static Client build(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			String telefono, String fax, String lineaDireccion1, String lineaDireccion2, String ciudad, String region,
			String pais, String codigoPostal, int codigoEmpleadoRepVentas, int limiteCredito) throws DuplicatedItemException{

		ClientDAO clientDao = new ClientDAO();
				
		if (!clientDao.read().get(codigoCliente).equals(null)) {
			throw new DuplicatedItemException();
		}
		return null;
	} 
	

}
