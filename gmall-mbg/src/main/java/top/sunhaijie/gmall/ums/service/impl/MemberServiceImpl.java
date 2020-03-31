package top.sunhaijie.gmall.ums.service.impl;

import top.sunhaijie.gmall.ums.entity.Member;
import top.sunhaijie.gmall.ums.mapper.MemberMapper;
import top.sunhaijie.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Suun
 * @since 2020-03-31
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
