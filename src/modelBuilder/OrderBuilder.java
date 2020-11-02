package modelBuilder;

import java.util.Date;

import model.OrderDAO;
import uml.Order;

public class OrderBuilder {
	
	public static Order build(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, String estado,
			String comentarios, int codigoCliente) throws DuplicatedItemException{
		
		OrderDAO orderDao = new OrderDAO();
		
		if (orderDao.insert(id))
		
		return null;
		
		
	}

}
