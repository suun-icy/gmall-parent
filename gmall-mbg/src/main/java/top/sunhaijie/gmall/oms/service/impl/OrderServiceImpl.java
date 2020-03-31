package top.sunhaijie.gmall.oms.service.impl;

import top.sunhaijie.gmall.oms.entity.Order;
import top.sunhaijie.gmall.oms.mapper.OrderMapper;
import top.sunhaijie.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
