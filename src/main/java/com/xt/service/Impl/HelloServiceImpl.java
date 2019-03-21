package com.xt.service.Impl;
import javax.jws.WebService;
import com.xt.service.HelloService;
@WebService
public class HelloServiceImpl implements HelloService {
    public String getUser() {
        return "调用啦";
    }
}
