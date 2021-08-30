package com.example.backend.model;


public class Article {
    private Integer id;
    private Integer weight;
    private String title;
    private Integer commentCounts;
    private Integer viewCounts;
    private String summary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }

    public Integer getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(Integer viewCounts) {
        this.viewCounts = viewCounts;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
