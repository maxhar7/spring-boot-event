package com.event.app.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserValidatedEvent {

    private String username;
    private String eventName;
    private boolean isValid;
}
