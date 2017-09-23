package org.springframework.cloud.stream.pubsub.subscriber.config;

import com.google.cloud.AuthCredentials;
import com.google.cloud.pubsub.PubSub;
import com.google.cloud.pubsub.PubSubOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PubSubConfig {

    @Value("${credentials.location}")
    private String credentialsLocation;

    @Value("${project.id}")
    private String projectId;

    @Bean
    public PubSub pubSub() throws Exception {
        return PubSubOptions
                .newBuilder()
                .setAuthCredentials(AuthCredentials
                        .createForJson(new ClassPathResource(credentialsLocation).getInputStream()))
                .setProjectId(projectId)
                .build()
                .getService();
    }
}
