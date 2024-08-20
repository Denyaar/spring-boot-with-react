/**
 * Created by tendaimupezeni for spring-boot-with-react
 * Date: 8/20/24
 * Time: 10:53 PM
 */

package com.denyaar.springbootwithreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardController {

    @GetMapping(value = "/**/{path:[^\\.]*}")
    public String forward() {
        return "forward:/";
    }

}
