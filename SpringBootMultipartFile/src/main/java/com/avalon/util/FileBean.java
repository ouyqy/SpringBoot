package com.avalon.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author ouyqy
 * @date 2017/11/17.
 */
@Component
public class FileBean {
    @Value("${file.address}")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
