package com.mycompany.myapp.web.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/value-test")
public class ValueTestController {

    @Value("${gitea.api.host.baseurl}")
    private String apiBaseurl;

    @Value("${gitea.host.baseurl}")
    private String baseurl;

    @Value("${gitea.one_time_password}")
    private String password;

    @GetMapping("/base-url")
    public String valueTest() {
        return baseurl;
    }

    @GetMapping("/api-base-url")
    public String valueAPITest() {
        return apiBaseurl;
    }

    @GetMapping("/password")
    public String valuePasswordTest() {
        return password;
    }
}
