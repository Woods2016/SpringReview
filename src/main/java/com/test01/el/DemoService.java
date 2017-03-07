package com.test01.el;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */

@Service
@Data
public class DemoService {

    @Value("家庭地址")
    private String address;
}
