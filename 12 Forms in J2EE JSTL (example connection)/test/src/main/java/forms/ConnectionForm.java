package forms;

import jakarta.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String status;
	
	public ConnectionForm() {
		this.status = "Unknown";
	}
	
	public void verifieConnection(HttpServletRequest request) {
		String username = request.getParameter("username");
		String passWord = request.getParameter("passWord");
		
		if (passWord.equals("0000"+username)) {
			this.status = "Your are connected";
		} else {
			this.status = "Your are not connected";
		}
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
