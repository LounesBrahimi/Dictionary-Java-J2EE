package dao;

import java.util.List;

import beans.ExceptionBean;
import beans.PersonBean;

public interface PersonDao {
	void insert( PersonBean person) throws ExceptionDAO;
	List<PersonBean> listAll() throws ExceptionDAO;
}
