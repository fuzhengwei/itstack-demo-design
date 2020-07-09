package org.itstack.demo.design.visitor;

import org.itstack.demo.design.user.impl.Student;
import org.itstack.demo.design.user.impl.Teacher;

public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);

}
