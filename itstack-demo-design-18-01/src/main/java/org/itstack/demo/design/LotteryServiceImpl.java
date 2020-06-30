package org.itstack.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class LotteryServiceImpl implements LotteryService {

    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    public LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 发短信
        logger.info("给用户 {} 发送短信通知(短信)：{}", uId, lottery);
        // 发MQ消息
        logger.info("记录用户 {} 摇号结果(MQ)：{}", uId, lottery);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

}
