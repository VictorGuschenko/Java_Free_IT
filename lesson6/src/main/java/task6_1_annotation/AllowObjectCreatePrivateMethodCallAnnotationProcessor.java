package task6_1_annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AllowObjectCreatePrivateMethodCallAnnotationProcessor {

    public void process(Class<?> clazz) throws Exception {
        boolean annotationPresent = clazz.isAnnotationPresent(Version.class);
        if (annotationPresent) {
            Version annotation = clazz.getAnnotation(Version.class);
            System.out.println("Annotation version: " + annotation.version());
            System.out.println("Code version: " + annotation.codeVersion());
            Constructor<?> constructorDefault = clazz.getConstructor();
            MyService myService = (MyService) constructorDefault.newInstance();
            myService.setVarInt(15);
            myService.setVarString("NoLucky");
            Method privateMethod = clazz.getDeclaredMethod("thisClassInfo");
            privateMethod.setAccessible(true);
            privateMethod.invoke(myService);
            Method methodToString = clazz.getDeclaredMethod("toString");
            System.out.println(myService);
        }
    }
}


