package com.yuan.diy;


//注解实现aop
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.yuan.Service.UserServiceImpl.*(..))")
    public void before () {
        System.out.println("前");
    }

    @After("execution(* com.yuan.Service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("后");
    }
}
