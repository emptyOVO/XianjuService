package com.xianju.demo.component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Payment {
    private Logger logger = LoggerFactory.getLogger(Payment.class);


    @Async   //使用异步
    @Scheduled(initialDelay = 90000000, fixedRate = 90000000) // @Scheduled：cron ：周期：秒 分 时 日 月 周
    public void payback() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //TODO:延迟放款
        logger.info(sdf.format(new Date())+"*********     自动放款      *********");
    }
}
