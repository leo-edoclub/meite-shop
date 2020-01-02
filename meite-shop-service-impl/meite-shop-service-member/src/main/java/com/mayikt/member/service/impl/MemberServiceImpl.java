package com.mayikt.member.service.impl;

import com.mayikt.entity.AppEntity;
import com.mayikt.member.feign.WeiXinServiceFeign;
import com.mayikt.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;
    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
