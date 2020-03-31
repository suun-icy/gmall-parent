package top.sunhaijie.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sunhaijie.gmall.pms.entity.ProductFullReduction;
import top.sunhaijie.gmall.pms.mapper.ProductFullReductionMapper;
import top.sunhaijie.gmall.pms.service.ProductFullReductionService;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
