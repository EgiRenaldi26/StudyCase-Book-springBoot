package com.protonema.test.pencatatan_buku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.protonema.test.pencatatan_buku.entity.Book;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book , Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE book SET title=:title WHERE book_id=:id", nativeQuery=true)
    public void updateTitle(@Param("title") String title, @Param("id") Long id);
    
}
