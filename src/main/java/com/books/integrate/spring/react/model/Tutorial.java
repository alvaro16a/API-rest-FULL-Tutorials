package com.books.integrate.spring.react.model;

import javax.persistence.*;

import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@Column(name = "price")
	private int price;

	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published, int price) {
		this.title = title;
		this.description = description;
		this.published = published;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {

		return published;
	}

	public void setPublished(boolean isPublished) {

		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "price="+ price +"]";
	}
	
}
