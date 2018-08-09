package uk.co.michaeloldroyd.example;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {
    private Logger log;

    public ExampleAspect(Logger log) {
        this.log = log;
    }

    @Around("execution(* uk.co.michaeloldroyd.example.ExampleController.exampleRequest(..))")
    public Object aspectAroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Entering {}", pjp.getClass());
        Object result = pjp.proceed();
        log.info("After {}", pjp.getClass());
        return result;
    }

    @Around("@annotation(exampleAnnotation)")
    public Object aspectAroundAnnotation(ProceedingJoinPoint pjp, ExampleAnnotation exampleAnnotation) throws Throwable {
        log.info("Entering {}", pjp.getClass());
        Object result = pjp.proceed();
        log.info("After {}", pjp.getClass());
        return result;
    }
}
