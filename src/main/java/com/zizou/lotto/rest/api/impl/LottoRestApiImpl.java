package com.zizou.lotto.rest.api.impl;

import com.zizou.lotto.model.LottoWonInfo;
import com.zizou.lotto.rest.api.LottoRestApi;
import org.json.JSONObject;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zizou on 2017-10-26.
 */
public class LottoRestApiImpl implements LottoRestApi{
    private final String baseUrl = "http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=";

    @Override
    public int getRecentWonSequence() {
        String result = this.requestRestApi();
        LottoWonInfo info = this.parseRestResult(result);
        return info.getWonSequence();
    }

    @Override
    public List<LottoWonInfo> getWonInfoList(int start, int end) {
        List<LottoWonInfo> list = new ArrayList<>();

        for(int i = start; i <= end; i++){
            String result = this.requestRestApi(i);
            list.add(this.parseRestResult(result));
        }

        return list;
    }

    private String requestRestApi() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate.getForObject(this.baseUrl, String.class);
    }

    private String requestRestApi(int sequence) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate.getForObject(this.baseUrl + sequence, String.class);
    }

    private LottoWonInfo parseRestResult(String result){
        JSONObject json = new JSONObject(result);
        int sequence = json.getInt("drwNo");

        LottoWonInfo info = new LottoWonInfo(sequence);
        List<Integer> wonNumList = info.getWonNumList();
        for(int i = 1; i <= 6; i++){
            wonNumList.add(json.getInt("drwNo" + i));
        }

        return info;
    }
}
