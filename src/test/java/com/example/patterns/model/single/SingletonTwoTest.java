package com.example.patterns.model.single;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SingletonTwoTest {


    @SneakyThrows
    @Test
    public void test() {
        System.out.println(SingletonTwo.getInstance("test").show());
        System.out.println(SingletonTwo.getInstance("test").show());
        System.out.println(SingletonTwo.getInstance("test").show());
        System.out.println(SingletonTwo.getInstance("test").show());
        System.out.println(SingletonTwo.getInstance("test").show());

    }

    @Test
    public void test2() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonTwo instance = null;
                try {
                    instance = SingletonTwo.getInstance("test");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(instance.show());
            }).start();
        }
    }

}