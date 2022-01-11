package com.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MathAspect {

	@Pointcut("execution(* com.mvc.math.Addition.add(..))")
	public void aroung() {

	};

	@Pointcut("execution(* com.mvc.math.Addition.sub(..))")
	public void afterReturning() {

	};

	@Pointcut("execution(* com.mvc.math.Addition.exceptionRaise(..))")
	public void before() {

	};

	@Pointcut("execution(* com.mvc.math.Addition.exceptionRaise(..))")
	public void afterThrowing() {

	};

	// @Around("execution(* com.mvc.math.Addition.*(..))")
	@Around("aroung()")
	public Object add(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		args[0] = (int) args[0] + 10;
		Object returnValue = joinPoint.proceed(args);
		return returnValue;
	}

	@AfterReturning(value = "afterReturning()", returning = "returnValue")
	public void sub(JoinPoint joinPoint, Object returnValue) {

		if (Integer.parseInt(returnValue.toString()) > 10) {
			System.out.println("In @AfterReturning: " + returnValue);
		}
	}

	@Before(value = "before()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("In @Before");
	}

	@AfterThrowing(value = "afterThrowing()", throwing = "exp")
	public void afterThrowing(JoinPoint joinPoint, Throwable exp) {
		if (exp instanceof ArithmeticException) {
			System.out.println("In @AfterThrowing, Exception raised");
		}
	}
}
