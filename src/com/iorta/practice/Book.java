package com.iorta.practice;

public class Book {
	String title;
	String author;
	int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;

	}
	
	public String displayInfo() {
		return "Book Title: " + title + ", Author: " + author + ", Year Published: " + year; 
	}
	
	public String getTitle() {
		return title;
	}
	
}
