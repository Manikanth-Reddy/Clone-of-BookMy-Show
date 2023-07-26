package org.mani.BookMyShow.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mani.BookMyShow.dto.BookMyShowDto;
import org.mani.BookMyShow.entiry.BookMyShowEntity;
import org.mani.BookMyShow.util.SessionFactoryUtil;

public class BookMyShowRepository {
	public void saveOrUpdate(BookMyShowEntity bookMyShowEntity) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(bookMyShowEntity);
		transaction.commit();
	}
	public BookMyShowEntity findMovieById(long id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(BookMyShowEntity.class,id);
	}
	public void updateMovie(BookMyShowDto bookMyShowDto) {
		BookMyShowEntity bookMyShowEntity = findMovieById(bookMyShowDto.getAlt_key());
		if(bookMyShowDto!=null) {
			bookMyShowEntity.setBudget(bookMyShowDto.getBudget());
			bookMyShowEntity.setRating(bookMyShowDto.getRating());
			saveOrUpdate(bookMyShowEntity);
		}
	}
}
