package com.giraffe.tree.web;

import com.giraffe.tree.dto.data.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/8/1
 **/
@Controller
public class LeafController {

    Message message = new Message();
    {
       message.setId(1);
       message.setTitle("中华");
       message.setText("漫画");
    };

    @RequestMapping(value = "message1", method = RequestMethod.GET)
    public String messages1(Model model) {
        model.addAttribute("messages", Arrays.asList(message));
        model.addAttribute("message", message);
        return "message/list";
    }
    @RequestMapping(value = "a", method = RequestMethod.GET)
    public String a(Model model) {
        message.setTitle("哈哈");
        model.addAttribute("messages", Arrays.asList(message));
        model.addAttribute("message", message);
        return "message/a";
    }
    @RequestMapping(value = "message2", method = RequestMethod.GET)
    public ModelAndView messages2() {
        ModelAndView mav = new ModelAndView("message/list");
        mav.addObject("messages", Arrays.asList(message));
        return mav;
    }

    @ModelAttribute("messages3")
    public List<Message> messages3() {
        return Arrays.asList(message);
    }
}
