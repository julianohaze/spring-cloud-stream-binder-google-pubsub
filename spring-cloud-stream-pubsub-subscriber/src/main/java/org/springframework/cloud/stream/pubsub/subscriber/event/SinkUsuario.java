package org.springframework.cloud.stream.pubsub.subscriber.event;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SinkUsuario {
    /**
     * topic name
     */
    public static final String INPUT_USUARIO_CRIADO = "input-usuario-criado";

    @Input(INPUT_USUARIO_CRIADO)
    SubscribableChannel inputUsuarioCriado();

}