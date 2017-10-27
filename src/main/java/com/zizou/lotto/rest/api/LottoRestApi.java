package com.zizou.lotto.rest.api;

import com.zizou.lotto.model.LottoWonInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zizou on 2017-10-26.
 */
@Component
public interface LottoRestApi {
    public int getRecentWonSequence();
    public List<LottoWonInfo> getWonInfoList(int start, int end);

}
