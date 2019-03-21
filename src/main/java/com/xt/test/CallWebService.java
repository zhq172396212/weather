package com.xt.test;

import com.xt.service.HelloServiceImplService;
import com.xt.service.HelloServiceImpl;

public class CallWebService {
    public static void main(String[] args) {
        HelloServiceImpl h = new HelloServiceImplService().getHelloServiceImplPort();
        System.out.println(h.getUser());
    }

}
