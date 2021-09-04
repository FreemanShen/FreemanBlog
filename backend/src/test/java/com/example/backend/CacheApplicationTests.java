package com.example.backend;


import com.example.backend.entity.Book;
import com.example.backend.repository.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheApplicationTests {
    @Autowired
    BookDao bookDao;
    @Test
    public void TestCache(){
    }
}
