package org.itstack.demo.design.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.itstack.demo.design.group.Employee;
import org.itstack.demo.design.group.GroupStructure;
import org.itstack.demo.design.group.Link;
import org.itstack.demo.design.lang.Iterator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_iterator() {
        GroupStructure groupStructure = new GroupStructure("1", "小傅哥");
        groupStructure.add(new Employee("2", "花花", "二级部门"));
        groupStructure.add(new Employee("3", "豆包", "二级部门"));
        groupStructure.add(new Employee("4", "蹦蹦", "三级部门"));
        groupStructure.add(new Employee("5", "大烧", "三级部门"));
        groupStructure.add(new Employee("6", "虎哥", "四级部门"));
        groupStructure.add(new Employee("7", "玲姐", "四级部门"));
        groupStructure.add(new Employee("8", "秋雅", "四级部门"));

        groupStructure.addLink("1", new Link("1", "2"));
        groupStructure.addLink("1", new Link("1", "3"));

        groupStructure.addLink("2", new Link("2", "4"));
        groupStructure.addLink("2", new Link("2", "5"));

        groupStructure.addLink("5", new Link("5", "6"));
        groupStructure.addLink("5", new Link("5", "7"));
        groupStructure.addLink("5", new Link("5", "8"));

        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            logger.info("{}，雇员 Id：{} Name：{}", employee.getDesc(), employee.getuId(), employee.getName());
        }

    }

}
