package com.yuan.ngu.spring.boot.elasticsearch.dao;


import com.yuan.ngu.spring.boot.elasticsearch.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookDao extends ElasticsearchRepository<Book,String> {

}
