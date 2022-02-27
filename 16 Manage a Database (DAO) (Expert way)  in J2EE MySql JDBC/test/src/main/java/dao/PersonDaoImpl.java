package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import beans.PersonBean;

public class PersonDaoImpl implements PersonDao{
	
	private DaoFactory daoFactory;
	
	public PersonDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void insert(PersonBean person) {
		Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO persons(firstName, lastName) VALUES(?, ?);");
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public List<PersonBean> listAll() {
		List<PersonBean> persons = new ArrayList<PersonBean>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet result = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            result = statement.executeQuery("SELECT firstName, lastName FROM persons;");

            while (result.next()) {
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");

                PersonBean person = new PersonBean(firstName, lastName);
                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
	}
}
