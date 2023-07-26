package org.mani.BookMyShow.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mani.BookMyShow.entiry.BookMyShowEntity;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		Properties properties = MysqlConnectionPropertiesUtil.getConnectionProperties();
		cfg.setProperties(properties);
		cfg.addAnnotatedClass(BookMyShowEntity.class);
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
