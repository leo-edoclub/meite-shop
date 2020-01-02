package com.mayikt.weixin.service.impl;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeixinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        return new AppEntity("wangweiappId","wangweiappName");
    }
}
