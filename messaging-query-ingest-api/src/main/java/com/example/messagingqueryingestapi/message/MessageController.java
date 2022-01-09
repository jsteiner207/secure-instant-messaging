package com.example.messagingqueryingestapi.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/message")
public class MessageController {

    private final StudentService studentService;

    public MessageController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Message> getMessages() {
        return studentService.getMessages();
    }

}
