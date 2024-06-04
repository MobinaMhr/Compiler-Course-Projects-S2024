import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Fptr {
    Object instance;
    String methodName;

    public Fptr(Object instance, String methodName) {
        this.instance = instance;
        this.methodName = methodName;
    }

    public Object invoke(ArrayList<Object> arguments) {
        int argumentsSize = arguments.size();
        Class[] argsClasses = new Class[argumentsSize];
        Object[] argsArray = new Object[argumentsSize];
        for(int i = 0; i < argumentsSize; i++) {
            argsClasses[i] = arguments.get(i).getClass();
            argsArray[i] = arguments.get(i);
        }
        Method objectMethod = null;
        try {
            objectMethod = this.instance.getClass().getMethod(this.methodName, argsClasses);
        } catch (NoSuchMethodException e) { 
            e.printStackTrace();
        }
        try {
            return objectMethod.invoke(this.instance, argsArray);
        } catch (IllegalAccessException | InvocationTargetException e) { 
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}