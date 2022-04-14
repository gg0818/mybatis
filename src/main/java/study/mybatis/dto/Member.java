package study.mybatis.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private Long memberId;
    private String email;
    private String password;
    private String name;
    private String phone;
    private String city;
    private String street;
    private String zipcode;
}
