package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest implements Runnable {
    
    public static void main(String[] args) {
        Class<?> c = ClassTest.class;
        System.out.println(c.getName());
        System.out.println("superclass: " + c.getSuperclass().getName());
        for (Class<?> ic : c.getInterfaces()) {
            System.out.println("interfaces: " + ic.getName());
        }
        for (Field f : c.getFields()) {
            System.out.println("field: " + f.getName());
        }
        for (Method m : c.getMethods()) {
            System.out.println("method: " + m.getName());
        }
    }

    @Override
    public void run() {
        System.out.println("run!");
    }
    
}