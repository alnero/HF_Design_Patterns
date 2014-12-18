package Proxy.PersonBeanDynamicProxy;

/**
 * Implementation of the person bean.
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        return rating == 0 ? 0 : (rating / ratingCount);
    }

    public void setHotOrNotRating(int index) {
        this.rating += index;
        ratingCount++;
    }


}
