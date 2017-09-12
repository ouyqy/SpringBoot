package com.avalon.service.impl;

import com.avalon.service.ListService;

/**
 * Created by ouyqy on 2017/9/12.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
