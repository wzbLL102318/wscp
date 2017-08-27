package com.git.wscp.web;

import com.git.wscp.domain.UserDomain;
import com.git.wscp.service.LogainUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ShallowDream on 2017/8/27.
 */
@Controller
@RequestMapping("/logainUser")
public class UserLogainController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private LogainUserService logainUserService;

    @RequestMapping(value = "/toIndex", method = {RequestMethod.GET, RequestMethod.POST})
    /**
     * 异步获取json数据，加上@responsebody后，会直接返回json数据。
     * @ResponseBody
     */
    public String toIndex(HttpServletRequest request, Model model) {
        UserDomain user = this.logainUserService.findUserByID(request.getParameter("id") == null ? "" : request.getParameter("id"));
        model.addAttribute("user", user);
        // 打印日志
        logger.info("user===" + user.getUserName());
        return "listShow";
    }
}