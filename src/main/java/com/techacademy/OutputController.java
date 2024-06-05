package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(Model model, @RequestParam String input_value,
            @RequestParam(required = false) String previous) {
        model.addAttribute("input_value", input_value);
        model.addAttribute("previous", previous);
        return "output";
    }

}
