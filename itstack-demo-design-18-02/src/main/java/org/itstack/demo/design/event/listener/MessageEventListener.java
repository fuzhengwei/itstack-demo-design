package org.itstack.demo.design.event.listener;

import org.itstack.demo.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户 {} 发送短信通知(短信)：{}", result.getuId(), result.getMsg());
    }

}