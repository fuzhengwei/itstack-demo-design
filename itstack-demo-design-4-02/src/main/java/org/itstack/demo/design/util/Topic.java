package org.itstack.demo.design.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Topic {

    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;           // 答案；B

    public Topic() {
    }

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
