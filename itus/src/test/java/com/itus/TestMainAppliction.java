package com.itus;

import com.itus.mapper.BillboardMapper;
import com.itus.model.entity.Billboard;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMainAppliction {
    @Autowired
    private BillboardMapper BillboardMapper;

    @Test
    public void testSelectAll(){
        List<Billboard> bmsBillboardlist=BillboardMapper.selectList(null);
        for (Billboard Billboard:bmsBillboardlist
             ) {
            System.out.println(Billboard);
        }

    }
}
