package com.gangadhar_shabbir.Inventory_manager;

import org.graalvm.compiler.replacements.nodes.CStringConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @GetMapping("/hello")
    public String hello () {
        return "Hello World";
    }
}
