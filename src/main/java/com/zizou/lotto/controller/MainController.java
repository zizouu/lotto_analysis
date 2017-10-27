package com.zizou.lotto.controller;

import com.zizou.lotto.model.LottoWonInfo;
import com.zizou.lotto.service.LottoPredicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zizou on 2017-10-17.
 */
@Controller
public class MainController {

    @Autowired
    private LottoPredicService predicService;

    @RequestMapping("/")
    public ModelAndView getIndex(){
        return new ModelAndView("index");
    }

    @ResponseBody
    @RequestMapping("/number")
    public String getNumber(){
        List<LottoWonInfo> list = predicService.getFrequencyNumber();
        return list.toString();
    }

}
