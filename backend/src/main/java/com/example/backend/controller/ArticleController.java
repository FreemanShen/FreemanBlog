package com.example.backend.controller;

import com.example.backend.model.Article;
import com.example.backend.service.ArticleService;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping("/article")
    public String article(){
        List<Article> articleList = articleService.getAllArticle();
        System.out.println(new Date()+"detecting");
        return JSON.toJSONString(articleList);
    }
}
