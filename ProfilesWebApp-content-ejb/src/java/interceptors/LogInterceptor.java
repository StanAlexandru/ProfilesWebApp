/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author alex_jbm
 */
public class LogInterceptor {
    
    @AroundInvoke
    public Object aroundInvoke(InvocationContext ctx){        
        System.out.println("LogInterceptor.aroundInvoke() Method: " + ctx.getMethod());
        //System.out.println("LogInterceptor.aroundInvoke() Parameters: " + ctx.getParameters());
        try{
            Object result = ctx.proceed();
            //System.out.println("LogInterceptor.aroundInvoke() Result: " + result);
            return result;
        }catch(Exception e){
            System.err.println("LogInterceptor.aroundInvoke() Exception: " + e);
            return null;
        }
    }
}
