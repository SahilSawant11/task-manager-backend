package com.example.taskmanager.controller;

import com.example.taskmanager.model.Attachment;
import com.example.taskmanager.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attachments")
@CrossOrigin(origins = "http://localhost:3000")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping
    public ResponseEntity<Attachment> createAttachment(@RequestBody Attachment attachment) {
        Attachment createdAttachment = attachmentService.createAttachment(attachment);
        return ResponseEntity.ok(createdAttachment);
    }

    // Add more endpoints as needed
}

