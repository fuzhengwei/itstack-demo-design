package org.itstack.demo.design;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
