package com.reena.BlogApi.dao;

import com.reena.BlogApi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
