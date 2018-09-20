package com.tong.headFirst.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
