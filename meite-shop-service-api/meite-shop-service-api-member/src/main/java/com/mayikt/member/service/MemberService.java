package com.mayikt.member.service;

import com.mayikt.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "会员服务接口")
public interface MemberService {

    /**
     * 会员调用微信
     * @return
     */
    @ApiOperation(value = "会员服务调用微信服务")
    @GetMapping("/memberToWeiXin")
    public AppEntity memberToWeiXin();
}
