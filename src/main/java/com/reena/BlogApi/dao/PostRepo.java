package com.reena.BlogApi.dao;

import com.reena.BlogApi.model.Category;
import com.reena.BlogApi.model.Post;
import com.reena.BlogApi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {
        List<Post> findByCategory(Category category);
        List<Post> findByUser(Users users);
        List<Post> findByTitleContaining(String title);
}
