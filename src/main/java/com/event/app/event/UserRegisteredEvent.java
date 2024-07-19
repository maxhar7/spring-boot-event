package com.event.app.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserRegisteredEvent {

    private String userName;
    private String password;
    private byte age;

}
