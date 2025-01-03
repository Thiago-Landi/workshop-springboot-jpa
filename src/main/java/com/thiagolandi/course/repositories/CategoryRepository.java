package com.thiagolandi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagolandi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
