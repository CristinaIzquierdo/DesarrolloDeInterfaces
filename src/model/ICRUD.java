package model;

import java.util.List;

public interface ICRUD {
	
	public String insert(Object obj);
	public String delete(Object obj);
	public String modify(Object obj);
	public List<?> read();
	public List<?> filter(String field, String searchCriteria);

}
