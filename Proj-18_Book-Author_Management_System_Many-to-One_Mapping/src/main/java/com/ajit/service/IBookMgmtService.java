package com.ajit.service;

import java.util.List;

import com.ajit.entity.Author;
import com.ajit.entity.Book;

public interface IBookMgmtService {

	Author saveAuthor(Author author);
	
	String addBook(Book book);
	List<Book> showAllBooks();
	String deleteBookById(Integer id);
}