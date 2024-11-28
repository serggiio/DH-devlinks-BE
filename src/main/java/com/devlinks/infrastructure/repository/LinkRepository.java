package com.devlinks.infrastructure.repository;

import com.devlinks.domain.entity.Link;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends MongoRepository<Link, String> {
}
