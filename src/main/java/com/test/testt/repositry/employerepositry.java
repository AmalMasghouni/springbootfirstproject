package com.test.testt.repositry;

import com.test.testt.entity.employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employerepositry extends CrudRepository<employe,Integer> {
}
