package com.example.vin.coolweather.util;

/**
 * Created by vin on 16/6/26.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
