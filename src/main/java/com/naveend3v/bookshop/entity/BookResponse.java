package com.naveend3v.bookshop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class BookResponse<T> {

    public static ResponseEntity<Object> generateResp(Object message, HttpStatus status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("status", status.value());
        map.put("timestamp", System.currentTimeMillis());
        return new ResponseEntity<Object>(map, status);
    }
}
