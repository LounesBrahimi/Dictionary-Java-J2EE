package dao;

import java.util.List;
import beans.PersonBean;

public interface PersonDao {
	void insert( PersonBean person);
	List<PersonBean> listAll();
}
