package com.giraffe.tree.web;

import com.giraffe.tree.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页 业务处理
 *
 * @author ruoyi
 */
@Controller
public class SysIndexController {


    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap) {
        User user = new User();
        user.setAvatar("122");
        mmap.put("user", user);
        return "index";
    }

    // 锁定屏幕
    @GetMapping("/lockscreen")
    public String lockscreen(ModelMap mmap) {

        return "lock";
    }

}
