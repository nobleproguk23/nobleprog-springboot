package org.nobleprog.springboot.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(org.nobleprog.springboot.aop.annotation.Log)")
    public void logPointcut(){
    }

    @Pointcut("within(org.nobleprog.springboot.aop.service.CustomerService)")
    public void logCustomerServiceInvocation(){}

    @Pointcut("execution(public void org.nobleprog.springboot.aop.service.CustomerService.createCustomer(Long)")
    public void logCustomerServiceInvocation1(){}

    @Before("logPointcut()")
    public void logAllMethodCallsAdvice(){
        System.out.println("In Aspect");
    }

    @After("logPointcut()")
    public void logAllMethodCallsAdviceAfter(){
        System.out.println("After...");
    }

    @AfterReturning("logPointcut()")
    public void logAllMethodCallsAdviceAfter1(){
        System.out.println("After...");
    }

    @AfterThrowing("logPointcut()")
    public void logAllMethodCallsAdviceAfter2(){
        System.out.println("After...");
    }

    @Around("")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Object arg = joinPoint.getArgs()[0];
        if(joinPoint.getArgs().length <0) {
            throw new RuntimeException("Argument should provided");
        }
        joinPoint.proceed();
    }
}