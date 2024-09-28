package com.nasleen.rest.webservices.restful_web_services.controller;

import org.springframework.web.bind.annotation.*;

//REST API
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping(path = "/hello-Rehan")
    public String sayHelloRehan() {
        return "Hello Rehan!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
