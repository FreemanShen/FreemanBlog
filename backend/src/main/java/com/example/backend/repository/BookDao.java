package com.example.backend.repository;

import com.example.backend.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "c1")
public class BookDao {
    @Cacheable(key = "#id")
    public Book getBookById(Integer id){
        Book book = new Book();
        book.setId(id);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        System.out.println("getBookById is running------- id = "+id);
        return (Book)book;
    }
    @CachePut(key = "#id")
    public String updateBookById(Integer id){
        System.out.println("updateBookById is running----------- id = "+id);
        return "success";
    }
    @Cacheable(key= "#id")
    public String deleteBookById(Integer Id){
        System.out.println("deleteBookById--------- id = "+Id);
        return "deleteCache success";
    }
}
