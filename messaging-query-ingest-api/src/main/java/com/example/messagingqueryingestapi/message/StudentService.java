package com.example.messagingqueryingestapi.message;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Message> getMessages() {
        return List.of(
                new Message(
                        1L,
                        "whatup",
                        LocalDate.now()
                )
        );
    }
}
