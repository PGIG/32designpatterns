package main.java.xyz.itbest.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/12/4 10:44
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}