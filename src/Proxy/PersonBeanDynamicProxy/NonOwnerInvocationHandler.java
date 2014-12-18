package Proxy.PersonBeanDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Methods called by the non-owners proxy will be handled by this handler.
 * All get methods are allowed and setHotOrNotRating is available as well.
 */
public class NonOwnerInvocationHandler implements InvocationHandler{
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if ("setHotOrNotRating".equals(method.getName())) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
