package com.example.backend;

import com.example.backend.entity.Book;
import com.example.backend.repository.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void test() {
        // System.out.println("hello");
        Book bk = new Book();
        bk.setName("西游记");
        bk.setAuthor("吴承恩");
        bk.setId(2);
        System.out.println(bk.toString());
    }
}
