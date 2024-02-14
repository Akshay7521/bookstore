package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {
	private Long id;
	private String title;
	private String isbn;
	private String description;
	private BigDecimal price;
	private LocalDate publicationDate;
	private Integer nbOfPages;
	private String imageUrl;

	public Long getId( ) {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getTitle( ) {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public String getIsbn( ) {
		return isbn;
	}

	public void setIsbn( String isbn ) {
		this.isbn = isbn;
	}

	public String getDescription( ) {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public BigDecimal getPrice( ) {
		return price;
	}

	public void setPrice( BigDecimal price ) {
		this.price = price;
	}

	public LocalDate getPublicationDate( ) {
		return publicationDate;
	}

	public void setPublicationDate( LocalDate publicationDate ) {
		this.publicationDate = publicationDate;
	}

	public Integer getNbOfPages( ) {
		return nbOfPages;
	}

	public void setNbOfPages( Integer nbOfPages ) {
		this.nbOfPages = nbOfPages;
	}

	public String getImageUrl( ) {
		return imageUrl;
	}

	public void setImageUrl( String imageUrl ) {
		this.imageUrl = imageUrl;
	}
}
