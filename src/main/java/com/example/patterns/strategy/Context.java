package com.example.patterns.strategy;

import lombok.Data;

/**
 * @author djx
 * @date 2021/5/11 下午2:52
 */
@Data
public class Context {

    private Strategy strategy;

    public void doStrategy(Object req) {
        // ...处理数据
        strategy.strategy(req);
        // ... 业务逻辑
    }

}
