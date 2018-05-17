package com.tutorial.elastic.repository;

import com.tutorial.elastic.model.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UsersRepository extends ElasticsearchRepository<Users, Long> {
    public List<Users> findByName(String text);

    List<Users> findBySalary(Long salary);
}
