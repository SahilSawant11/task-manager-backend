package com.example.taskmanager.service;

import com.example.taskmanager.model.Attachment;
import com.example.taskmanager.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    public Attachment createAttachment(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }

    // Add more methods as needed
}
