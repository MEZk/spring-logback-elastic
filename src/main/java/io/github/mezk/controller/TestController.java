package io.github.mezk.controller;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        log.info("Invoking TestController#sayHello");

        try {
            MDC.put("key1", "value1");
            generateException();
        } catch (NullPointerException ex) {
            log.error(ex.getMessage(), ex);
            MDC.put("key2", "value2");

        }

        return "Hello, World!";
    }

    private static void generateException() {
        final String nullStr = null;
        nullStr.endsWith("A");
    }
}
