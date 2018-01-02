package com.designmt.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.designmt.project.model.AppUser;


public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
