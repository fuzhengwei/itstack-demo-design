package org.itstack.demo.design.visitor.impl;

import org.itstack.demo.design.user.impl.Student;
import org.itstack.demo.design.user.impl.Teacher;
import org.itstack.demo.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 家长
public class Parent implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Parent.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }

}
