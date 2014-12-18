package Proxy.PersonBeanDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * Class to test Person bean proxies.
 */
public class PersonBeanTestDrive {
    HashMap<String, PersonBean> datingDB = new HashMap<>();

    public static void main(String[] args) {
        PersonBeanTestDrive test = new PersonBeanTestDrive();
        test.drive();
    }

    public PersonBeanTestDrive() {
        initializeDatabase();
    }

    public void drive(){
        PersonBean joe = getPersonFromDatabase("Joe Javabean");

        System.out.println("---Testing OWNER Proxy---");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Is it a proxy class dispatching method calls: " +
                            Proxy.isProxyClass(ownerProxy.getClass()));
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling");
        System.out.println("Interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e){
            System.out.println("Owner can't set its own rating!");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        System.out.println("\n---Testing NON Owner Proxy---");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Is it a proxy class dispatching method calls: " +
                Proxy.isProxyClass(nonOwnerProxy.getClass()));
        System.out.println("Name is " + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling");
        } catch (Exception e){
            System.out.println("Non owner can't set interests of a person!");
        }
        nonOwnerProxy.setHotOrNotRating(5);
        System.out.println("Rating set by the non owner");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getProxy(InvocationHandler handler, PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler);
    }

    PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
