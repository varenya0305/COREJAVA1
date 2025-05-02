package com.iorta.practice;

public class Ebook extends Book{
	public Ebook(String title, String author, int year) {
		super(title, author, year);
	}

	@Override
	public String displayInfo() {
		return super.displayInfo() + ", [Digital Format]";
	}
}
