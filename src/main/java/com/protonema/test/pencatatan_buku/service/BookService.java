package com.protonema.test.pencatatan_buku.service;

import java.util.List;
import java.util.Optional;

import com.protonema.test.pencatatan_buku.entity.Book;

public interface BookService {
    
    public void addBook(Book book);
    
    public List<Book> getAllBook();

    public Optional<Book> getBookById(Long id);

    public void updateTitle(String title, Long id);

    public void deleteBookById(Long id);
}
