package main.java.xyz.itbest.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/12/4 10:44
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}