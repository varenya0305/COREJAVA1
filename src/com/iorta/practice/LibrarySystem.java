package com.iorta.practice;

import java.util.Scanner;

public class LibrarySystem {
	static Scanner scanner = new Scanner(System.in);
	static Library library = new Library();

	static void menu() {

		while(true) {
			System.out.println("\nChoose an action: ADD, SHOW, FIND, EXIT");
			String choice = scanner.nextLine();

			switch (choice) {
			case "ADD":
				System.out.println("Enter Book Title: ");
				String title = scanner.nextLine();
				System.out.println("Enter Author: ");
				String author = scanner.nextLine();
				System.out.println("Enter Year: ");
				int year = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Is it an EBook? (yes/no): ");
				String isEbook = scanner.nextLine().trim().toLowerCase();

				if(isEbook.equals("yes")) {
					library.addBook(new Ebook(title, author, year));
				} else {
					library.addBook(new Book(title, author, year));
				}
				break;
			case "SHOW":
				library.displayBooks();
				break;
			case "FIND":
				System.out.println("Enter Book Title to search: ");
				String searchTitle = scanner.nextLine();
				library.findBook(searchTitle);
				break;
			case "EXIT":
				System.out.println("Exiting Library System...");
				return;

			default:
				System.out.println("Invalid option. Try again;");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
