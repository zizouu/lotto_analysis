package com.zizou.lotto.service;

import com.zizou.lotto.model.LottoWonInfo;
import com.zizou.lotto.rest.api.LottoRestApi;
import com.zizou.lotto.thread.LottoRestExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zizou on 2017-10-17.
 */
@Service
public class LottoPredicService {
    @Autowired
    private LottoRestApi restApi;
    @Autowired
    private LottoRestExecutor executor;

    public List<LottoWonInfo> getFrequencyNumber(){
        int recentSeq = this.restApi.getRecentWonSequence();

    }
}
