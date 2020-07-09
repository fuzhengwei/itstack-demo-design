package org.itstack.demo.design.visitor.impl;

import org.itstack.demo.design.user.impl.Student;
import org.itstack.demo.design.user.impl.Teacher;
import org.itstack.demo.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 校长
public class Principal implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Principal.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
    }

    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }

}
