package com.demo.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.app.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
