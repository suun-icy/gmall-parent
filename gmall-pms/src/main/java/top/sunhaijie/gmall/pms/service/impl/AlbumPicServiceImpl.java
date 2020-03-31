package top.sunhaijie.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.sunhaijie.gmall.pms.entity.AlbumPic;
import top.sunhaijie.gmall.pms.mapper.AlbumPicMapper;
import top.sunhaijie.gmall.pms.service.AlbumPicService;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Component
@Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
