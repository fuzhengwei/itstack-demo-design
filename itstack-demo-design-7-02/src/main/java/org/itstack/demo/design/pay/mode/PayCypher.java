package org.itstack.demo.design.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayCypher implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }

}
