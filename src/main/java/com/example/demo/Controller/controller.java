package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/bfhl")
public class controller {

    @PostMapping
    public Map<String, Object> process(@RequestBody Map<String, List<String>> request) {

        List<String> data = request.getOrDefault("data", new ArrayList<>());

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for (String item : data) {

            if (item.matches("\\d+")) {
                numbers.add(item);
            } else {
                alphabets.add(item);
            }
        }

        Map<String, Object> response = new HashMap<>();

        response.put("is_success", true);

        // CHANGE THESE VALUES
        response.put("user_id", "aditi_22052005");
        response.put("email", "yourmail@gmail.com");
        response.put("roll_number", "YOURROLLNUMBER");

        response.put("numbers", numbers);
        response.put("alphabets", alphabets);

        return response;
    }
}