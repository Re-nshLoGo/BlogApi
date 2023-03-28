package com.reena.BlogApi.dao;

import com.reena.BlogApi.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comments,Integer> {
}
