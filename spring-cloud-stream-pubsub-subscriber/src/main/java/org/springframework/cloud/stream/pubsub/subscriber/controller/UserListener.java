package org.springframework.cloud.stream.pubsub.subscriber.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.pubsub.subscriber.event.SinkUsuario;
import org.springframework.cloud.stream.pubsub.subscriber.model.User;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(SinkUsuario.class)
public class UserListener {

    @StreamListener(SinkUsuario.INPUT_USUARIO_CRIADO)
    public void onMessageReceived(User user) {
        System.out.println("Receiving message: " + user);
    }
}
