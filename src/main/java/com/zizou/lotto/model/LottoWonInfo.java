package com.zizou.lotto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zizou on 2017-10-19.
 */

public class LottoWonInfo implements Serializable{
    private int wonSequence;
    private List<Integer> wonNumList;

    public LottoWonInfo(int wonSequence){
        this.wonSequence = wonSequence;
        this.wonNumList = new ArrayList<>();
    }

    public int getWonSequence() {
        return wonSequence;
    }

    public List<Integer> getWonNumList() {
        return wonNumList;
    }

    public void setWonNumList(List<Integer> wonNumList){
        this.wonNumList = wonNumList;
    }

    public int getWonNumCount(){
        return this.wonNumList.size();
    }

    public void addWonNumber(int wonNum){
        if(!this.wonNumList.contains(wonNum)){
            this.wonNumList.add(wonNum);
        }
    }

    @Override
    public String toString() {
        return "LottoWonInfo{" +
                "wonSequence=" + wonSequence +
                ", wonNumList=" + wonNumList +
                '}';
    }
}
