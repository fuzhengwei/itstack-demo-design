package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.cook.ICook;
import org.itstack.demo.design.cuisine.ICuisine;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 *
 * 山东（鲁菜）
 */
public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}