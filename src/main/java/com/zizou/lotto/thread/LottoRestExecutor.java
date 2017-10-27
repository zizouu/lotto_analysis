package com.zizou.lotto.thread;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zizou on 2017-10-27.
 */
@Component
public class LottoRestExecutor{
    private ExecutorService executor;

    @PostConstruct
    private void initExecutor(){
        this.executor = Executors.newCachedThreadPool();
    }

    public

}
