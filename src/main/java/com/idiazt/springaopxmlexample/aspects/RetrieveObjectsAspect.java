package com.idiazt.springaopxmlexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.idiazt.springaopxmlexample.entities.BaseEntity;

public class RetrieveObjectsAspect {

    private static Logger logger = LoggerFactory.getLogger(RetrieveObjectsAspect.class);

    public void executeBefore() {
        logger.info("Entering the aspect...");
    }

    public void executeAfter(JoinPoint joinpoint, BaseEntity result) {
        logger.info("Leaving the aspect...");
    }

    public Object executeAround(ProceedingJoinPoint joinpoint) {
        try {
            Object result = joinpoint.proceed();
            logger.info(result.toString());
            return result;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
        
}
