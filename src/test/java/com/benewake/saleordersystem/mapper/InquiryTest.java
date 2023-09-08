package com.benewake.saleordersystem.mapper;

import com.alibaba.fastjson2.JSONObject;
import com.benewake.saleordersystem.SaleOrderSystemApplication;
import com.benewake.saleordersystem.entity.Inquiry;
import com.benewake.saleordersystem.entity.VO.FilterCriteria;
import com.benewake.saleordersystem.mapper.Vo.SalesOrderVoMapper;
import com.benewake.saleordersystem.service.InquiryService;
import com.benewake.saleordersystem.service.ViewService;
import com.benewake.saleordersystem.utils.BenewakeConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lcs
 * @since 2023年07月04 10:44
 * 描 述： TODO
 */
@SpringBootTest
@ContextConfiguration(classes = SaleOrderSystemApplication.class)
public class InquiryTest implements BenewakeConstants {
    @Autowired
    InquiryService inquiryService;
    @Autowired
    SalesOrderVoMapper salesOrderVoMapper;
    @Autowired
    ViewService viewService;

    @Test
    public void testList(){
        Map<String, Map<String,Object>> filters = new HashMap<>();
        Map<String,Object> f1 = new HashMap<>();
    }

    @Test
    public void getOrderTypeCode(){
        inquiryService.getDocumentNumberFormat(4,10).forEach(System.out::println);
    }

    @Test
    public List<Inquiry> test(){
        Inquiry inquiry=inquiryService.getInquiryById(334L);
        List<Inquiry> fail = new ArrayList<>();
        // 将inquiry对象添加到fail列表中
        fail.add(inquiry);
        return fail;
    }




    @Test
    public void testView(){
        viewService.getUserView(6L,1L).forEach(c-> JSONObject.toJSONString(c).toString());
    }

    @Autowired
    ItemMapper itemMapper;
    @Test
    public void testkucun(){
        itemMapper.getInventories(null,null,"2023-7-30").forEach(c-> {
            c.forEach((k, v) -> System.out.print(k + ":" + v + " "));
            System.out.println();
        });
    }
}
