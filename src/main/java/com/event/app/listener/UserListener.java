package com.event.app.listener;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener
    public UserValidatedEvent listenUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
        log.info("LISTENING: UserRegisteredEvent Event has been listened -> {}", userRegisteredEvent.toString());
        //this return register new event in spring context whith out an explicit publisher
        return new UserValidatedEvent(userRegisteredEvent.getUserName(), "Event from listenUserRegisteredEvent -> return",true);
    }

    @EventListener
    public void listenUserValidatedEvent(UserValidatedEvent userValidatedEvent){
        log.info("LISTENING: UserValidatedEvent Event has been listened -> {}", userValidatedEvent.toString());
    }
}
