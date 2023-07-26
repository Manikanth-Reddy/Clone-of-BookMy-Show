package org.mani.BookMyShow.util;

import java.util.Properties;

public class MysqlConnectionPropertiesUtil {
	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/book_my_show");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "Manikanth!4289");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		 return properties;
		
	}
}
