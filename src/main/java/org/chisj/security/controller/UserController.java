package org.chisj.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2018-10-26 16:41
 * @Description:
 */
@RestController
@Slf4j
public class UserController {

    @GetMapping("/user")
    public String user() {
        log.info("this is user.");
        return "this is user.";
    }
}
