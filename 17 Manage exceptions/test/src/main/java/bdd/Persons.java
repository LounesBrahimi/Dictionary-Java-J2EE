package bdd;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import beans.ExceptionBean;
import beans.PersonBean;

public class Persons {
	
	private Connection connexion;
	
	public Persons() {
	}
	
    public List<PersonBean> getPersons() {
        List<PersonBean> persons = new ArrayList<PersonBean>();
        Statement statement = null;
        ResultSet result = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Execute the request
            result = statement.executeQuery("SELECT firstName, lastName FROM persons;");

            // get the data
            while (result.next()) {
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                
                PersonBean person = null;
				try {
					person = new PersonBean(firstName, lastName);
				} catch (ExceptionBean e) {
					e.printStackTrace();
				}
                persons.add(person);
            }
        } catch (SQLException e) {
        } finally {
            // closing the connexion
            try {
                if (result != null)
                    result.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        return persons;
    }
    
    private void loadDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertPerson(PersonBean person) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO persons(firstName, lastName) VALUES(?, ?);");
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
