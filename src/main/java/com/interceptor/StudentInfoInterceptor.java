package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class StudentInfoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 在请求处理之前进行调用（Controller方法调用之前）
        // 返回值为true则继续向下执行，返回值为false则中断请求
        // 您可以在这里编写逻辑来检查学生信息是否已经提交
        // 如果没有提交，您可以使用response.sendRedirect()方法将请求重定向到input.jsp页面
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String birthDate = request.getParameter("birthDate");
        String score = request.getParameter("score");
        if (studentId == null || name == null || gender == null || birthDate == null || score == null) {
            response.sendRedirect("input");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
        // 在这里您可以对请求域中的属性或视图进行修改
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // 在整个请求处理完成后进行调用，即在视图渲染完毕时进行调用
        // 在这里您可以进行一些资源清理操作
    }

}