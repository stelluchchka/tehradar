package com.stelluchchka.t1.models;

import java.util.List;

public class ResponseWrapper<T> {
    private T data;

    public ResponseWrapper(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}