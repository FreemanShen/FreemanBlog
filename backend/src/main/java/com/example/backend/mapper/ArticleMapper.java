package com.example.backend.mapper;

import com.example.backend.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    int addArticle(Article article);
    int deleteArticleById(Integer id);
    int updateArticleById(Integer id);
    Article getArticleById(Integer id);
    List<Article> getAllArticles();
}
