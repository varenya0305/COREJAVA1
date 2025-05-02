package com.iorta.practice;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> books = new ArrayList<>();
	
	public static void showLibraryInfo() {
		System.out.println("Welcome to the Digital Library! Manage books and eBooks easily.");
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Added: " + book.displayInfo());
	}
	
	public void addBook(List<Book> Books) {
		books.addAll(Books);
		System.out.println("Books added.");
	}
	
	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the library.");
			return;
		}
		System.out.println("\n Library Collection:");
		for (Book book : books) {
			System.out.println("- " + book.displayInfo());
		}
	}
	
	public void findBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)){
				System.out.println("Found:" + book.displayInfo());
				return;
			}
		}
		System.out.println("Book not found");
	}
}
