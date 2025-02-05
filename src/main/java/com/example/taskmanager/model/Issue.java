package com.example.taskmanager.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false)
    private String status;
    
    @Column(nullable = false)
    private String priority;
    
    private String assignedTo;
    private String devNote;
    private String category;
    private String teamLead;
    private LocalDate date;
    private String project;
    private String example;
    private String reportedBy;
    private LocalDate resolutionDate;

    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attachment> attachments;

    // Getters
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getDevNote() {
        return devNote;
    }

    public String getCategory() {
        return category;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProject() {
        return project;
    }

    public String getExample() {
        return example;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDevNote(String devNote) {
        this.devNote = devNote;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}

