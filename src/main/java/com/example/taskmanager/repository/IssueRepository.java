package com.example.taskmanager.repository;

import com.example.taskmanager.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}

