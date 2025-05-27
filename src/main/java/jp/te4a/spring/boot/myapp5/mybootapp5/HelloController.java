package jp.te4a.spring.boot.myapp5.mybootapp5;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public ModelAndView postForm(@RequestParam("text1") String text1) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("msg", "you write '" + text1 + "'!!!");
        return mv;
    }
    
}
