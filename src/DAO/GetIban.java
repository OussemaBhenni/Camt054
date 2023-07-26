package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.datatype.XMLGregorianCalendar;

public class GetIban {
	private static Connection con = Conection.conecter();

	public static String getIbanWithTransactionID(String TransactionID) {
		try {
			String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN  FROM GDEV.ZEUPAVI0 WHERE EUPAVITXI ='"
					+ TransactionID + "'";
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

	public static String getIbanWithEndToEndID(String EndToEndID) {
		try {
			String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN  FROM GDEV.ZEUPAVI0 WHERE EUPAVIEND ='"
					+ EndToEndID + "'";
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
			String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN  FROM GDEV.ZEUPAVI0 WHERE EUPAVIMON ='"
					+ montant + "'" + " and EUPAVIDEV= '" + devise + "'" + " and EUPAVIDVA= '" + date + "'"
					+ " and EUPAVINDO= '" + nomDuDonneurDordre + "'";
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

}
