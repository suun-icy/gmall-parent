package top.sunhaijie.gmall.oms.service.impl;

import top.sunhaijie.gmall.oms.entity.OrderItem;
import top.sunhaijie.gmall.oms.mapper.OrderItemMapper;
import top.sunhaijie.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
