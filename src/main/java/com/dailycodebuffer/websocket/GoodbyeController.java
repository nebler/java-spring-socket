package com.dailycodebuffer.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GoodbyeController {

    @MessageMapping("/goodbye")
    @SendTo("/topic/goodbyes")
    public Goodbye goodbye(Goodbye message) throws InterruptedException {
        return new Goodbye("Hey was geht, " +
                HtmlUtils.htmlEscape(message.getMessage()), true);
    }
}
