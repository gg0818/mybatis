package study.mybatis.dao;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import study.mybatis.dto.Member;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberDaoTest {
    @Autowired
    MemberDao memberDao;

    @Test
    public void 회원가입() throws Exception{
        Member member = new Member();
        member.setEmail("gihyun0818@gmail.com");
        member.setName("장지현");
        member.setPassword("1234");
        member.setPhone("01093890818");
        member.setCity("서울시");
        member.setStreet("양천구");
        member.setZipcode("1234");

        int join = memberDao.joinMember(member);

        Assertions.assertEquals(join, 1);
    }

    @Test
    public void 회원중복확인() throws Exception{
        Member member = new Member();
        member.setEmail("gihyun0818@gmail.com");
        member.setName("장지현");
        member.setPassword("1234");
        member.setPhone("01093890818");
        member.setCity("서울시");
        member.setStreet("양천구");
        member.setZipcode("1234");

        Member member2 = new Member();
        member2.setEmail("gihyun0818@gmail.com");
        member2.setName("장지현");
        member2.setPassword("1234");
        member2.setPhone("01093890818");
        member2.setCity("서울시");
        member2.setStreet("양천구");
        member2.setZipcode("1234");



    }
}