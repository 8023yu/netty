package com.tool;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
