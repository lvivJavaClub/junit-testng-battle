package com.example.parallel;

import com.example.zutils.Sleeper;
import org.testng.annotations.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestTestNg1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("start " + LocalTime.now().getSecond());
    }

    @AfterClass
    public void afterClass() {
        System.out.println("end " + LocalTime.now().getSecond());
    }

    @Test(dataProvider = "cities")
    public void test2(String city, int population) {
        System.out.println(city + " " + population);
        Sleeper.seconds(4);
    }

    @DataProvider(name = "cities", parallel = true) // threadPoolSize 10 default, change in xml
    public Object[][] cities() {
        return new Object[][]{
            {"1", 1},
            {"2", 2},
            {"3", 3},
            {"4", 4},
            {"5", 5},
            {"6", 6},
            {"7", 7},
            {"8", 8},
            {"9", 9},
            {"10", 10},
            {"11", 11},
        };
    }
}
