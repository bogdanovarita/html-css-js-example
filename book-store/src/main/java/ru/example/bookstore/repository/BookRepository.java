package ru.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
