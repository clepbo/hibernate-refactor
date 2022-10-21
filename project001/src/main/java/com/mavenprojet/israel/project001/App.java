package com.mavenprojet.israel.project001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Creating configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// creating session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initializing session
		Session session = sessionFactory.openSession();

		String csvFilePath = "C:\\Users\\Depittaz\\Documents\\People-datas.csv";

		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
			CSVParser peoplesData = CSVParser.parse(br,
					CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

			String hql = "SELECT dv.email FROM Data_value dv";
			Query query = session.createQuery(hql);
			List results = ((org.hibernate.query.Query) query).list();
			ArrayList<String> email = (ArrayList<String>) results;
			int counter = 0;
			
			for (CSVRecord pd : peoplesData) {
				if (email.contains(pd.get(7))) {
					System.out.println("Record alreay exist. Skipping...");
				} else {
						Data_value dv = new Data_value();
						dv.setFirstName(pd.get(0));
						dv.setLastName(pd.get(1));
						dv.setCompanyName(pd.get(2));
						dv.setAddress(pd.get(3));
						dv.setCity(pd.get(4));
						dv.setPhoneNo1(pd.get(5));
						dv.setPhoneNo2(pd.get(6));
						dv.setEmail(pd.get(7));

						session.beginTransaction();
						session.save(dv);
						session.getTransaction().commit();
						counter += 1;
				}
			}
			if(counter != 0) {
				System.out.println("Successfully saved "+counter+" records!");
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
