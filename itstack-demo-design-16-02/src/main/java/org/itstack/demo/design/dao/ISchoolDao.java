package org.itstack.demo.design.dao;

import org.itstack.demo.design.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
