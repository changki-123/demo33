package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // 사용자에게 표시할 메시지
        return "서비스에 문제가 발생했습니다. 관리자에게 문의하세요.";
    }

}
