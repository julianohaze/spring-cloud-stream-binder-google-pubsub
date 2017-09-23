package org.springframework.cloud.stream.pubsub.publisher.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SourceUsuario {
    /**
     * topic name
     */
    public static final String OUTPUT_USUARIO_CRIADO = "output-usuario-criado";

    @Output(OUTPUT_USUARIO_CRIADO)
    MessageChannel outputUsuarioCriado();
}