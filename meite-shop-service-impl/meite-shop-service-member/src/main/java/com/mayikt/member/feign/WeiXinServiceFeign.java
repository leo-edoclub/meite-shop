package com.mayikt.member.feign;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("app-mayikt-weixin")
public interface WeiXinServiceFeign extends WeiXinService {
}
