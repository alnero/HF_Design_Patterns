package Proxy.PersonBeanDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Invocation handler for the owner of the object. All methods are allowed to be called except setting of the rating.
 */
public class OwnerInvocationHandler implements InvocationHandler{
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }  else if ("setHotOrNotRating".equals(method.getName())) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
