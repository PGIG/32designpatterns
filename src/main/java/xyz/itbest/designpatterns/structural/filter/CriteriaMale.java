package main.java.xyz.itbest.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/12/4 10:44
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
