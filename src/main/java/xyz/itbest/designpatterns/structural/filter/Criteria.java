package main.java.xyz.itbest.designpatterns.structural.filter;

import java.util.List;

/**
 * @author pgig
 * @date 2018/12/4 10:43
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
