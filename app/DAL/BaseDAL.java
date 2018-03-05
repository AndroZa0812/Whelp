package DAL;


import java.util.ArrayList;
import java.util.List;

import io.ebean.Ebean;

public class BaseDAL<T> {
	
	private Class<T> type;
	
	public BaseDAL(Class<T> model) {
		setType(model);
	}
	
	public List<T> getAll() {
		try {
			return Ebean.find(getType()).findList();	
		} catch (Exception e) {
			return null;
		}
	}
	
	public T getById(Object Id) {
		try {
			return Ebean.find(getType(), Id);	
		} catch (Exception e) {
			return null;
		}
	}
	
	public Boolean insert(Object model) {
		try {
			Ebean.insert(model);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean update(Object model) {
		try {
			Ebean.update(model);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean delete(Object model) {
		try {
			Ebean.delete(model);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}
}
