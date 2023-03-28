package com.reena.BlogApi.dao;

import com.reena.BlogApi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
}
