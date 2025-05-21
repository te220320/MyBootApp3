package jp.te4a.spring.boot.myapp5.mybootapp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("msg","this is a settig message");
        //return "this is Spring Boot sample."
    return "index";
    }
    @RequestMapping(value="post", method=RequestMethod.POST)
    public ModelAndView postForm(@RequestParam("text1") String text1) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("msg", "you write '" + text1 + "'!!!");
        return mv;
    }
    
}
