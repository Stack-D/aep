package com.itus.service.impl;

import com.itus.entity.Tip;
import com.itus.mapper.TipMapper;
import com.itus.service.TipService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每日赠言 服务实现类
 * </p>
 *
 * @author 邓国华
 * @since 2021-12-02
 */
@Service
public class TipServiceImpl extends ServiceImpl<TipMapper, Tip> implements TipService {

}
