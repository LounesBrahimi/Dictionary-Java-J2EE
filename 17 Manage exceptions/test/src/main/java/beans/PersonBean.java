package beans;

public class PersonBean {
    private String firstName;
    private String lastName;
    
    public PersonBean() {
    	this.firstName = "";
    	this.lastName = "";
    }
    
    public PersonBean(String firstName, String lastName)throws ExceptionBean{
    	if (firstName.length() > 20) {
    		throw new ExceptionBean("The first name should be smaller than 20 chars");
    	} else if (lastName.length() > 20) {
    		throw new ExceptionBean("The last name should be smaller than 20 chars");
    	} else {
        	this.firstName = firstName;
        	this.lastName = lastName;	
    	}
    }
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}