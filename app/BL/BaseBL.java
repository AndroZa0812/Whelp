package BL;
import java.util.List;

import DAL.BaseDAL;

public class BaseBL<T> {
	private BaseDAL<T> dal;
	
	public BaseBL(BaseDAL<T> model) {
		setDal(model);
	}
	
	public List<T> getAll() {
		return getDal().getAll();
	}
	
	public T getById(Object Id) {
		return getDal().getById(Id);
	}
	
	public Boolean insert(Object model) {
		return getDal().insert(model);
	}
	
	public Boolean update(Object model) {
		return getDal().update(model);
	}
	
	public Boolean delete(Object model) {
		return getDal().delete(model);
	}

	public BaseDAL<T> getDal() {
		return dal;
	}

	public void setDal(BaseDAL<T> dal) {
		this.dal = dal;
	}
	
}
