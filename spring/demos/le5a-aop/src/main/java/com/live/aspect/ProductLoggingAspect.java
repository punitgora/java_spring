package com.live.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//Logging Aspect
@Aspect

public class ProductLoggingAspect {

//The Before advice executes the functionality before the function is executed.
//The Advice takes the pointcut expression
//@Before("execution(public String getProductName())")
//public void getProductNameBeforeAdvice() {
//	System.out.println("Before Advice : This is called before the execution of getProductName() method of Product class.");
//}
@After("execution(public String getProductName())")
public void getProductNameAfterAdvice() {
	System.out.println("After Advice : This is called after the execution of getProductName() method of Product class.");
}

@Around("execution(public String getProductName())")
public Object getProductNameAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
	System.out.println("Around This is called before the execution of getProductName() method of Product class.");
	Object value = "";
	value = proceedingJoinPoint.proceed();
//	public String getProductName() {
//		System.out.println("getProductName() executed!");
//		return productName;
//	}
	System.out.println("Around This is called  after the execution of getProductName() method of Product class.");
	System.out.println("Return Value inside Advice : " + value);
	return value;
}
//
@Before("execution(* com.live.repository.*.get*())")
public void getProductsMySqlRepository() {
	System.out.println("This is called before the execution of getters in the repository.");
}

}
