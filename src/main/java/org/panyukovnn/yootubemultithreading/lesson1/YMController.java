package org.panyukovnn.yootubemultithreading.lesson1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class YMController {

    @GetMapping
    public String getHelloWorld() {
        String message = "current thread is: " + Thread.currentThread().getName();

        log.info(message);

        return message;
    }
}
