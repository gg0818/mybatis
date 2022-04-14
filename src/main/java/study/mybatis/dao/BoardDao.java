package study.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import study.mybatis.dto.Board;

import java.util.List;

@Mapper
public interface BoardDao {
    List<Board> boardList();
}
