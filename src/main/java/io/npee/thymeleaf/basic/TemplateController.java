package io.npee.thymeleaf.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment")
    public String fragment() {

        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layout() {

        return "template/layout/layoutMain";
    }
    
    @GetMapping("/layoutExtend")
    public String layoutExtend() {
        
        return "template/layoutExtend/layoutExtendMain";
    }
}
