package com.example.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.entity.MallOrderEntity;
import com.example.demo.mapper.MallOrderDao;
import com.example.demo.service.MallOrderService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("mallOrderService")
public class MallOrderServiceImpl extends ServiceImpl<MallOrderDao, MallOrderEntity> implements MallOrderService {



}
