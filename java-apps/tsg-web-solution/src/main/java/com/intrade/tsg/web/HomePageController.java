package com.intrade.tsg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created: 10/11/13 17:49 by: horako
 */
@Controller
@RequestMapping(value="/")
public class HomePageController {

    @RequestMapping(value="index")
    public String index(Model model) {
        System.out.println("in hp controller");
        model.addAttribute("dateTime", new Date());
        return "/index.jsp";
    }
}
