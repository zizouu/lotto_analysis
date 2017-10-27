package com.zizou.lotto.thread.task;

import com.zizou.lotto.model.LottoWonInfo;
import com.zizou.lotto.rest.api.LottoRestApi;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Callable;

/**
 * Created by zizou on 2017-10-27.
 */
public class LottoRestTask implements Callable<LottoWonInfo>{
    @Autowired
    private LottoRestApi restApi;

    @Override
    public LottoWonInfo call() throws Exception {
        return null;
    }
}
