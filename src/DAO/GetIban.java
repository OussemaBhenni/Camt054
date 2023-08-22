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
			String s = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN,EUPAVITXI TransactionID  FROM GDEV.ZEUPAVI0 WHERE EUPAVITXI  LIKE '%"
					+ TransactionID + "%'";

			// System.out.println("solution 1");
			// System.out.println(s);

			// Execute the query and process the results
			Statement statement = con.createStatement();
			ResultSet tranId = statement.executeQuery(s);

			while (tranId.next()) {
				String t = tranId.getString("TransactionID").trim();
				if (t.equals(TransactionID)) {
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
			// System.out.println("solution 2");
			// System.out.println(sqlQuery);
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

			String month = (date.getMonth() <= 9) ? "0" + date.getMonth() : String.valueOf(date.getMonth());
			String day = (date.getDay() <= 9) ? "0" + date.getDay() : String.valueOf(date.getDay());
			int yearLastTwoDigits = date.getYear() % 100;
			int composedDate = Integer.parseInt("1" + yearLastTwoDigits + month + day);
			String sanitizedDevise = devise.replace("'", "''"); // Escape single quotes
			String sanitizedNom = nomDuDonneurDordre.replace("'", "''"); // Escape single quotes

			String sqlQuery = "SELECT EUPAVIPDT || EUPAVIIDS || EUPAVIBDT IBAN FROM GDEV.ZEUPAVI0 WHERE EUPAVIMON = "
					+ montant + " AND EUPAVIDEV = '" + sanitizedDevise + "' AND EUPAVIDVA = " + composedDate
					+ " AND EUPAVINDO = '" + sanitizedNom + "'";

			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			if (resultSet.next()) {
				String iban = resultSet.getString("IBAN");
				return iban;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
