package com.avalon.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author ouyqy
 * @date 2017/11/17.
 */
public interface DownService {
    String downFile(HttpServletRequest request, HttpServletResponse response, String fileName);
}
