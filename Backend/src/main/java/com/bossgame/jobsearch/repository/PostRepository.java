package com.bossgame.jobsearch.repository;

import com.bossgame.jobsearch.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
