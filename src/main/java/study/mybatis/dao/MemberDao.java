package study.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import study.mybatis.dto.Member;

import java.util.List;

@Mapper
public interface MemberDao {
    int joinMember(Member member);
    List<Member> findMember(String email);
}
