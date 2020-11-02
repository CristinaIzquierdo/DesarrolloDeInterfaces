package modelBuilder;


import exception.DuplicatedException;
import exception.PossibleClientDataDuplication;
import model.ClientDAO;
import uml.Client;

public class ClientBuilder {
	
	public static Client build(int codigoCliente, 
							   String nombreCliente, 
							   String apellidoContacto,
							   String telefono) throws DuplicatedException, PossibleClientDataDuplication{

		Client client = new Client(codigoCliente, 
								   nombreCliente, 
								   apellidoContacto,
								   telefono);
		
		ClientDAO clientDao = new ClientDAO();
				
		if (!(clientDao.getClient(codigoCliente) == null)) {
			throw new DuplicatedException(client);
		}
		
		if ((clientDao.possibleDataDuplication(client))) {
			throw new PossibleClientDataDuplication(client);
		}
		return client;
	} 
	

}
