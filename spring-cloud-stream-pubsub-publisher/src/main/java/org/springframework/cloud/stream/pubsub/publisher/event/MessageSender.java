package org.springframework.cloud.stream.pubsub.publisher.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.pubsub.publisher.model.User;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(SourceUsuario.class)
public class MessageSender {

    @Autowired
    private SourceUsuario source;

    public void send(User user) {
        Message<User> message = MessageBuilder.withPayload(user).build();
        source.outputUsuarioCriado().send(message);
    }
}