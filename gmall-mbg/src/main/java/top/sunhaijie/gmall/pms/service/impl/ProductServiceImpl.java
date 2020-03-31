package top.sunhaijie.gmall.pms.service.impl;

import top.sunhaijie.gmall.pms.entity.Product;
import top.sunhaijie.gmall.pms.mapper.ProductMapper;
import top.sunhaijie.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
