
package com.xt.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloServiceImpl", targetNamespace = "http://Impl.service.xt.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloServiceImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://Impl.service.xt.com/", className = "com.xt.service.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://Impl.service.xt.com/", className = "com.xt.service.GetUserResponse")
    @Action(input = "http://Impl.service.xt.com/HelloServiceImpl/getUserRequest", output = "http://Impl.service.xt.com/HelloServiceImpl/getUserResponse")
    public String getUser();

}
