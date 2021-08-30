package com.example.backend.service;

import com.example.backend.mapper.ArticleMapper;
import com.example.backend.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
//    public int addBook(Book book) {
//        return bookMapper.addBook(book);
//    }
//    public int updateBook(Book book) {
//        return bookMapper.updateBookById(book);
//    }
//    public int deleteBookById(Integer id) {
//        return bookMapper.deleteBookById(id);
//    }
//    public Book getBookById(Integer id) {
//        return bookMapper.getBookById(id);
//    }
    public List<Article> getAllArticle() {
        return articleMapper.getAllArticles();
    }
}
