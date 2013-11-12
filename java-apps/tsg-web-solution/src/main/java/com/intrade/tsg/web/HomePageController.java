package com.intrade.tsg.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    static final Logger LOG = LoggerFactory.getLogger(HomePageController.class);

    @RequestMapping(value="index")
    public String index(Model model) {
        LOG.info("in hp controller");
        model.addAttribute("dateTime", new Date(System.currentTimeMillis()));
        model.addAttribute("something", "attribute3");
        return "/index.jsp";
    }
}
