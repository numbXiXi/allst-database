package com.allst.mysql;

import com.allst.mysql.entity.Position;
import com.allst.mysql.repository.PositionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AllstMysqlApplication.class)
class AllstMysqlApplicationTests {

    @Autowired
    private PositionRepository positionRepository;

    @Test
    void contextLoads() {
        for (int i = 0; i < 20; i++) {
            Position position = new Position();
            // position.setId(++i);
            position.setCity("GuangZhou");
            position.setName("zhangSan:" + i);
            position.setSalary("123456.78");
            positionRepository.save(position);
        }
    }

}
