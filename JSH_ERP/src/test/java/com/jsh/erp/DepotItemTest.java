package com.jsh.erp;

import com.alibaba.fastjson.JSON;
import com.jsh.erp.service.MaterialExtend.MaterialExtendService;
import com.jsh.erp.service.depotItem.DepotItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepotItemTest {

    @Resource
    private DepotItemService depotItemService;

    private Logger log = LoggerFactory.getLogger(DepotItemTest.class);

    @Test
    public void getFinishNumber() throws Exception{
        BigDecimal num = depotItemService.getFinishNumber(568l,238l);
        log.info("depot result:" + JSON.toJSONString(num));
    }
}
