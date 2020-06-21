package org.itstack.demo.design.test;

import org.itstack.demo.design.XiaoEr;
import org.itstack.demo.design.cook.impl.GuangDongCook;
import org.itstack.demo.design.cook.impl.JiangSuCook;
import org.itstack.demo.design.cook.impl.ShanDongCook;
import org.itstack.demo.design.cook.impl.SiChuanCook;
import org.itstack.demo.design.cuisine.ICuisine;
import org.itstack.demo.design.cuisine.impl.GuangDoneCuisine;
import org.itstack.demo.design.cuisine.impl.JiangSuCuisine;
import org.itstack.demo.design.cuisine.impl.ShanDongCuisine;
import org.itstack.demo.design.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 */
public class ApiTest {

    @Test
    public void test(){

        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        // 下单
        xiaoEr.placeOrder();

    }

    @Test
    public void test_(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("Mary","1243ew");
        map.put("Anna","fds32");
        map.put("Bom","dfre23");
        map.put("Jim","bbnyt");
        map.put("Kary","ppli");
        System.out.println(map.keySet());

        for (String k:map.keySet()){
            System.out.println(k.hashCode());
        }

        Map<String,String> map2 = new HashMap<String, String>();
        map2.put("A","1243ew");
        map2.put("B","fds32");
        map2.put("C","dfre23");
        map2.put("D","bbnyt");
        map2.put("E","ppli");



        System.out.println(map2.keySet());
        for (String k:map2.keySet()){
            System.out.println(k.hashCode());
        }
    }

}
