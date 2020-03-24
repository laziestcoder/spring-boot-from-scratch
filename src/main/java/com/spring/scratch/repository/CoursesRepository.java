package com.spring.scratch.repository;

import com.spring.scratch.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "courses", path = "courses")
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
}
