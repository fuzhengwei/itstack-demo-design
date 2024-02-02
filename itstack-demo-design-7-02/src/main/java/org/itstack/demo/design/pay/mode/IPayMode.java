package org.itstack.demo.design.pay.mode;

/**
 * 桥接接口
 */
public interface IPayMode {

    boolean security(String uId);

}
