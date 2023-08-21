package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conection {

	public static Connection  conecter() {
		String url = "jdbc:oracle:thin:@10.7.106.181:1521:devat";
        String username = "gdev";
        String password = "gdev";

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the database connection
            return DriverManager.getConnection(url, username, password);

        } catch ( Exception e) {
            e.printStackTrace();}
        
        return null;
	}

	public Connection  getData() {


        try {



             String sqlQuery = "SELECT ID,EUPAVICOP  FROM GDEV.ZEUPAVI0 WHERE EUPAVICOP ='R0V' ";

            // Execute the query and process the results
            Statement statement = this.conecter().createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                // Access and process data from the result set
                int id = resultSet.getInt("id");
                String EUPAVICOP = resultSet.getString("EUPAVICOP");


                // Perform desired operations with the retrieved data
                System.out.println("ID: " + id + ", Name: " + EUPAVICOP );
            }

            // Close the resources
            resultSet.close();
            statement.close();

        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

}
