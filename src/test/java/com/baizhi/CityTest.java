package com.baizhi;

import com.baizhi.entity.City;
import com.baizhi.mapper.CityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityTest {
    @Autowired
    CityMapper cityMapper;

    @Test
    public void test() {
        City city = cityMapper.selectByPrimaryKey(1L);
        System.out.println(city);
    }
}
