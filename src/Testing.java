import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testing {
    public static void main (String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       /*System.out.println(Singleton.getInstance().hashCode());
       System.out.println(Singleton.getInstance().hashCode());
       // useing enum
        System.out.println(ReflectionSafe.INSTANCE.hashCode());*/
        final Constructor<ReflectionSafe> declaredConstructor = ReflectionSafe.class.getDeclaredConstructor();
    declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance());
    }
}
