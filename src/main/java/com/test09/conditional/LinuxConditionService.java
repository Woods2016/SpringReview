package com.test09.conditional;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/17
 */
public class LinuxConditionService implements ConditionService {
    @Override
    public String getServerName() {
        return "linux";
    }
}
