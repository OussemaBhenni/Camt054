package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.xml.datatype.XMLGregorianCalendar;

public class GetIban {
	private static Connection con = Conection.conecter();

	public static String getIbanWithTransactionID(String TransactionID) {
		try {
			String s ="SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN,EUPAVITXI TransactionID  FROM GDEV.ZEUPAVI0 WHERE EUPAVITXI  LIKE '%"+TransactionID+"%'";

	
			//System.out.println("solution 1");
			//System.out.println(s);

			// Execute the query and process the results
			Statement statement = con.createStatement();
			ResultSet tranId = statement.executeQuery(s);

			while (tranId.next()) {
				String t = tranId.getString("TransactionID").trim();
				if(t.equals(TransactionID)) {
					return tranId.getString("IBAN").trim();
				}
			}
			

			// Close the resources
			tranId.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String getIbanWithEndToEndID(String EndToEndID) {
		try {
			String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN  FROM GDEV.ZEUPAVI0 WHERE EUPAVICOP ='R0V' AND EUPAVIEND ='"
					+ EndToEndID + "'";
			//System.out.println("solution 2");
			//System.out.println(sqlQuery);
			// Execute the query and process the results
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {
				return resultSet.getString("IBAN");
			}

			// Close the resources
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String getIbanWithMontantDeviseDate(BigDecimal montant, String devise, XMLGregorianCalendar date,
	        String nomDuDonneurDordre) {
	    try {
	        String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN FROM GDEV.ZEUPAVI0 WHERE EUPAVIMON = ?"
	                + " and EUPAVIDEV = ? and EUPAVIDVA = ? and EUPAVINDO = ?";
	        
	        // Execute the query and process the results
	        PreparedStatement statement = con.prepareStatement(sqlQuery);
	        statement.setBigDecimal(1, montant);
	        statement.setString(2, devise);
	        
	        // Convert the XMLGregorianCalendar to a long value representing the date in milliseconds since epoch
	        String s,j ;
	        if(date.getMonth()<=9) {
	        	s="0"+date.getMonth();
	        }else {
	        	s =""+date.getMonth();
	        }
	        if(date.getDay()<=9) {
	        	j="0"+date.getDay();
	        }else {
	        	j =""+date.getDay();
	        }
	        statement.setInt(3, new Integer("1"+date.getYear()%100+s+j));
	        
	        statement.setString(4, nomDuDonneurDordre);
	        System.out.println("SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN FROM GDEV.ZEUPAVI0 WHERE EUPAVIMON = "+montant+"and EUPAVIDEV = "+devise+" and EUPAVIDVA = "+new Integer("1"+date.getYear()%100+s+j)+" and EUPAVINDO = "+nomDuDonneurDordre);


	        
	        ResultSet resultSet = statement.executeQuery();
	        System.out.println(resultSet.next());
	        
	        	
	        
	       
	        while (resultSet.next()) {
	        	System.out.println("Iban =====>"+resultSet.getString("IBAN"));
	            return resultSet.getString("IBAN");
	        }

	        // Close the resources
	        resultSet.close();
	        statement.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return null;
	}


}
