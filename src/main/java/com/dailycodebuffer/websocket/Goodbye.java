package com.dailycodebuffer.websocket;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Goodbye {
    private String message;
    private boolean seeYouAgain;
}
