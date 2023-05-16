package com.protonema.test.pencatatan_buku.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protonema.test.pencatatan_buku.entity.Book;
import com.protonema.test.pencatatan_buku.repository.BookRepository;
import com.protonema.test.pencatatan_buku.service.BookService;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository BookRepository;

    @Override
    public void addBook(Book book) {
       BookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return BookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        Optional<Book> book = BookRepository.findById(id);

        return book;
    }

    @Override
    public void updateTitle(String title, Long id ) {
        BookRepository.updateTitle(title, id);
    }

    @Override
    public void deleteBookById(Long id) {
        BookRepository.deleteById(id);
    }
}
