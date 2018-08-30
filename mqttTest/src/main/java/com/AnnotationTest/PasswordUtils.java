package com.AnnotationTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordUtils {
    @UseCase(id=47,description = "password must contain at least one numberic")
    public boolean validatePassword(String password){
         return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id=48 )
    public String encryptPassword(String password){
             return new StringBuilder(password).reverse().toString();
    }

    public static void main(String[] args) {
        List<Integer> userCase=new ArrayList<Integer>();
        Collections.addAll(userCase,47,48,49);
        trackUseCase(userCase,PasswordUtils.class);
    }
    public static void trackUseCase( List<Integer>userCase,Class<?> cl){
           for (Method m:cl.getDeclaredMethods()){
               UseCase uc=m.getAnnotation(UseCase.class);
               if(uc!=null){
                   System.out.println("found id"+uc.id()+"  "+uc.description());
                    userCase.remove(new Integer(uc.id()));
               }
           }
           for(int i:userCase){
               System.out.println("warning missing use case -"+i);
           }
    }
}
