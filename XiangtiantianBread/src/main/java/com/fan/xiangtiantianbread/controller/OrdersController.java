package com.fan.xiangtiantianbread.controller;

import com.fan.xiangtiantianbread.service.OrdersService;
import com.fan.xiangtiantianbread.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Order")
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * 返回一周内营收列表
     * @return
     */
    @GetMapping
    public Result getWeekIncome(){
        List<Integer> weekIncome = new ArrayList<>();
        long now = new Date().getTime();


        return Result.success(now);
    }

}
