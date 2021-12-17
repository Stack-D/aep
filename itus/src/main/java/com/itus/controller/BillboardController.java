package com.itus.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itus.common.api.ApiResult;
import com.itus.model.entity.Billboard;
import com.itus.service.BillboardService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
public class BillboardController extends BaseController{

    @Resource
    private BillboardService billboardService;

    @GetMapping("/show")
    public ApiResult<Billboard> getNotices(){
        //条件：show为1
        List<Billboard> list = billboardService.list(new
                LambdaQueryWrapper<Billboard>().eq(Billboard::getShow,true));
        //返回最后一条记录
        return ApiResult.success(list.get(list.size()- 1));
    }
}
