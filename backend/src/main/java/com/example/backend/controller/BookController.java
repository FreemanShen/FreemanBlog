package com.example.backend.controller;

import com.example.backend.entity.Book;
import com.example.backend.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    BookDao bookDao;
    @GetMapping("/getBook")
    public Book getBook(Integer id){
        return (Book)bookDao.getBookById(id);
    }
    @GetMapping("/deleteBook")
    public String deleteBook(Integer id){
        return bookDao.deleteBookById(id);
    }
    @GetMapping("/updateBook")
    public String updateBook(Integer id){
        return bookDao.updateBookById(id);
    }
    @GetMapping("/redisTest")
    public String redisTest(){
        ValueOperations ops = redisTemplate.opsForValue();
        ValueOperations<String,String> ops1 = stringRedisTemplate.opsForValue();
        ops.set("tomorrow","saturday");
        return (String)ops.get("tomorrow");
    }
}
