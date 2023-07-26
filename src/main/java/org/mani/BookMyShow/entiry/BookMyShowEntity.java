package org.mani.BookMyShow.entiry;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="movie_info")
public class BookMyShowEntity implements Serializable {
	@Id
	@Column(name = "alt_key")
	private long alt_key;
	@Column(name="movie_name")
	private String movie_name;
	@Column(name="actor_name")
	private String actor_name;
	@Column(name="actress_name")
	private String actress_name;
	@Column(name="release_date")
	private String release_date;
	@Column(name="rating")
	private String rating;
	@Column(name="budget")
	private String budget;

	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	public String getActress_name() {
		return actress_name;
	}

	public void setActress_name(String actress_name) {
		this.actress_name = actress_name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}
}
