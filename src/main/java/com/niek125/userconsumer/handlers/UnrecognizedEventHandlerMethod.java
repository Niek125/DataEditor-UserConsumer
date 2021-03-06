package com.niek125.userconsumer.handlers;

import com.niek125.userconsumer.events.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UnrecognizedEventHandlerMethod extends HandlerMethod {
    private final Logger logger = LoggerFactory.getLogger(UnrecognizedEventHandlerMethod.class);

    protected UnrecognizedEventHandlerMethod() {
        super(UnrecognizedEventHandlerMethod.class);
    }


    @Override
    public void handle(Event event) {
        logger.info("could not find: {}", event.getClass().getSimpleName());
    }
}
