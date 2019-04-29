package web.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import web.entitites.RegisterBean;

public class RegisterDao {

	static Connection currentCon = null;

	public static RegisterBean add(RegisterBean customer) {
		Statement stmt = null;

		String addQuery = "insert into customer (firstName, lastName, adress, email, gender, securityAns, userID, password) values('"
				+ customer.getFirstName() + "', '" + customer.getLastname() + "', '" + customer.getAddress() + "', '"
				+ customer.getEmail() + "', '" + customer.getGender() + "', '" + customer.getSecurityAns() + "', '"
				+ customer.getUserID() + "', '" + customer.getPassword() + "')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(addQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Register failed: An Exception has occurred! " + ex);
		}

		return customer;
	}

	public static List<RegisterBean> view(String userID) {
		
		List<RegisterBean> customer = new ArrayList<>();
		Statement stmt = null;
		String viewQuery = "select firstName,lastname,adress,email,gender from customer where userID='" + userID + "'";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			ResultSet result = stmt.executeQuery(viewQuery);

			while (result.next()) {
				RegisterBean acc = new RegisterBean();
				acc.setFirstName(result.getString("firstName"));
				acc.setLastname(result.getString("lastName"));
				acc.setAddress(result.getString("adress"));
				acc.setEmail(result.getString("email"));
				acc.setGender(result.getString("gender"));
				customer.add(acc);
			}

			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Failed: An Exception has occurred! " + ex);
		}

		return customer;
	}
}
