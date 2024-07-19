package com.event.app.publisher;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserPublisher {

    //events will be published in the spring context
    private final ApplicationEventPublisher eventPublisher;

    public void publishUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
        log.info("PUBLISH: UserRegisteredEvent has been published -> {}", userRegisteredEvent.toString());
        eventPublisher.publishEvent(userRegisteredEvent);
    }

    public void publishUserValidatedEvent(UserValidatedEvent userValidatedEvent){
        log.info("PUBLISH: UserValidatedEvent has been published -> {}", userValidatedEvent.toString());
        eventPublisher.publishEvent(userValidatedEvent);
    }
}
