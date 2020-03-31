package top.sunhaijie.gmall.oms.service.impl;

import top.sunhaijie.gmall.oms.entity.CartItem;
import top.sunhaijie.gmall.oms.mapper.CartItemMapper;
import top.sunhaijie.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
