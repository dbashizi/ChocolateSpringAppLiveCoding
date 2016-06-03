package com.tiy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by localdom on 6/3/2016.
 */
@Controller
public class SimpleController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String chocolate(Model model, HttpSession session) {
        return "sample";
    }


}
