package com.avalon.service.impl;

import com.avalon.service.ListService;

/**
 * Created by ouyqy on 2017/9/12.
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
