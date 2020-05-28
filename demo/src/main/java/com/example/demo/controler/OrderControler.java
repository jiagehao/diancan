package com.example.demo.controler;

import com.example.demo.service.OrderService;
import com.example.domain.Order;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderControler {
    @Autowired
    private OrderService orderService ;
    //商家查询订单并设置为接单状态
    @GetMapping("/findall")
    public List<Order> findall(){
        List<Order> list = OrderService.findAll();
        return list;
    }
    //删除订单，如果为已接单则无法删除
    @GetMapping("/deletebyid")
    public void delet(Integer id){
        orderService.delete(id);
    }
    //顾客查询订单 并查看总价格
    @GetMapping("/findbll")
    public List<Order> findbll(){
        List<Order> list = OrderService.findbll();
        return list;
    }
    //顾客下单
    @GetMapping("/add")
    public void add(Integer id){
         OrderService.add(id);
    }



}
