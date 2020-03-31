package top.sunhaijie.gmall.pms.service.impl;

import top.sunhaijie.gmall.pms.entity.Comment;
import top.sunhaijie.gmall.pms.mapper.CommentMapper;
import top.sunhaijie.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
