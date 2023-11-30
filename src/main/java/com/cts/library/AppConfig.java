package com.cts.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cts.library.Book;
import com.cts.library.Student;
import com.cts.library.Classroom;
import com.cts.library.Library;

@Configuration
public class AppConfig {
	@Bean
    public Book book() {
        Book book = new Book();
        book.setTitle("Sample Title");
        book.setAuthor("Sample Author");
        return book;
    }
 
    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("ABC");
        student.setAge(25);
        return student;
    }
    
	@Bean
    public Library library(Book book) {
        Library library = new Library();
        library.setBook(book);
        return library;
    }
 
    @Bean
    public Classroom classroom(Student student) {
        return new Classroom(student);
    }

}
