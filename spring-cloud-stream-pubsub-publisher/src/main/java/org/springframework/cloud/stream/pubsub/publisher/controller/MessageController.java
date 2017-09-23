package org.springframework.cloud.stream.pubsub.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.pubsub.publisher.event.MessageSender;
import org.springframework.cloud.stream.pubsub.publisher.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageSender messageSender;

    @PostMapping("send")
    public void send() {
        User user = new User(UUID.randomUUID().toString(), "maria@email.com", "Maria");
        messageSender.send(user);

        System.out.println("Sending message: " + user);
    }
}
