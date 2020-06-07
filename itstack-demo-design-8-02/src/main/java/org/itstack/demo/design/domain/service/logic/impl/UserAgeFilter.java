package org.itstack.demo.design.domain.service.logic.impl;

import org.itstack.demo.design.domain.service.logic.BaseLogic;

import java.util.Map;

public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
