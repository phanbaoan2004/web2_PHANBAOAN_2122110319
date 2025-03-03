package com.example.phanbaoan;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWordController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @PostMapping("/data")
    public String postData(@RequestBody RequestData requestData) {
        return "Received data: Name = " + requestData.getName() + ", Age = " + requestData.getAge();
    }

    @PutMapping("/data")
    public String updateData(@RequestBody RequestData requestData) {
        return "Updated data: Name = " + requestData.getName() + ", Age = " + requestData.getAge();
    }

    @DeleteMapping("/data")
    public String deleteData(@RequestParam String name) {
        return "Deleted data for Name = " + name;
    }


    public static class RequestData {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
