package com.bossgame.jobsearch.repository;

import com.bossgame.jobsearch.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
