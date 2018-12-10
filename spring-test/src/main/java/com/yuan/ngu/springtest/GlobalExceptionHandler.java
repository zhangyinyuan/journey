package com.yuan.ngu.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常统一处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleCookieException(Exception e, HttpServletRequest request) throws Exception {
        //cookie 失效，跳转到 登录界面
        ModelAndView mv = new ModelAndView();
        log.info("handleCookieException called with: request.getScheme() = " + request.getScheme());
        String url = "http://www.baidu.com";
        mv.setView(new RedirectView(url, true, false));
        return mv;
//        response.sendRedirect(url);
    }

}
