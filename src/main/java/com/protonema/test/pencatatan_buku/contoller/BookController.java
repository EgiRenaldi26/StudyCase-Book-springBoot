package com.protonema.test.pencatatan_buku.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protonema.test.pencatatan_buku.entity.Book;
import com.protonema.test.pencatatan_buku.service.impl.BookServiceImpl;

@RestController
@RequestMapping("/api/Book")
public class BookController {

    @Autowired
    BookServiceImpl BookService;
    
    //GET
    @GetMapping
    public ResponseEntity getAllStudent(){
         List<Book> book = BookService.getAllBook();

         return ResponseEntity.ok(book);
    }

    //post
    @PostMapping
    public ResponseEntity addStudent(@RequestBody Book book) {
        BookService.addBook(book);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/detail")
    public ResponseEntity getBookById(@RequestParam Long id) {
        Optional<Book> book = BookService.getBookById(id);

        return ResponseEntity.ok(book); 
    }

    //put
    @PutMapping
    public ResponseEntity updateFullname(@RequestParam Long id, @RequestBody Book book){
        BookService.updateTitle(book.getTitle(), id);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    //delete
    @DeleteMapping
    public ResponseEntity deleteStudentById(@RequestParam Long id) {
        
        BookService.deleteBookById(id);

        return ResponseEntity.ok(HttpStatus.OK);
    }
    
}
