package com.example.diningwith.core.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component
public class LogInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

//        ThreadLocal<RequestContext> threadLocal = new ThreadLocal<>();
//        log.info(
//                ""
//                new ObjectMapper().writeValueAsString(threadLocal.get())
//        );
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        ThreadLocal<RequestContext> threadLocal = new ThreadLocal<>();
//        ServletInputStream inputStream = request.getInputStream();
//        inputStream.
//        String inputStr = StreamUtils.copyToString(inputStream, Charset.defaultCharset());
//        threadLocal.set(
//                new RequestContext(
//                        inputStr,
//                        request.getHeader("traceId")
//                )
//        );
        return true;
    }
}
