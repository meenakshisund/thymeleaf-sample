package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class ThymeLeafController {

    @GetMapping("/welcome/{name}")
    public String welcome(Model model, @PathVariable("name") String name) {

        List<Object> difference = Arrays.asList("Difference", 1, 2);
        List<Object> missingItems = Arrays.asList("Missing Items", 1, 2);
        List<Object> summary = Arrays.asList("Summary", 1, 2);

        Report report = new Report();
        report.setDifference(difference);
        report.setMissingItems(missingItems);
        report.setSummary(summary);

        model.addAttribute("name", name);
        model.addAttribute("report", report);

        return "welcome";
    }
}
