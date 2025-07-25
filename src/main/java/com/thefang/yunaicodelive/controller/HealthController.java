package com.thefang.yunaicodelive.controller;

import com.thefang.yunaicodelive.common.BaseResponse;
import com.thefang.yunaicodelive.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康接口检查
 *
 * @author Thefang
 * @create 2025/7/25
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("OK!");
    }
}
