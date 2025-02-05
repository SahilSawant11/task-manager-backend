package com.example.taskmanager.service;

import com.example.taskmanager.model.Issue;
import com.example.taskmanager.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }

    public Issue getIssueById(Long id) {
        return issueRepository.findById(id).orElse(null);
    }

    public Issue createIssue(Issue issue) {
        return issueRepository.save(issue);
    }

    public Issue updateIssue(Long id, Issue issueDetails) {
        Issue issue = issueRepository.findById(id).orElse(null);
        if (issue != null) {
            issue.setDescription(issueDetails.getDescription());
            issue.setStatus(issueDetails.getStatus());
            issue.setPriority(issueDetails.getPriority());
            issue.setAssignedTo(issueDetails.getAssignedTo());
            issue.setDevNote(issueDetails.getDevNote());
            issue.setCategory(issueDetails.getCategory());
            issue.setTeamLead(issueDetails.getTeamLead());
            issue.setDate(issueDetails.getDate());
            issue.setProject(issueDetails.getProject());
            issue.setExample(issueDetails.getExample());
            issue.setReportedBy(issueDetails.getReportedBy());
            issue.setResolutionDate(issueDetails.getResolutionDate());
            return issueRepository.save(issue);
        }
        return null;
    }

    public void deleteIssue(Long id) {
        issueRepository.deleteById(id);
    }
}

