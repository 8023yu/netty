package com.tool;

/**
 * 生成随机code
 */
public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
