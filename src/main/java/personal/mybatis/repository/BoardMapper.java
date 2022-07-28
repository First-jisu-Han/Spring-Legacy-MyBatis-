package personal.mybatis.repository;


import org.apache.ibatis.annotations.Mapper;
import personal.mybatis.model.Board;

import java.util.List;


@Mapper
public interface BoardMapper {

    // 게시판 글 추가
    public int insert(Board board);

    // 게시판 글 업데이트
    public int update(Board board);

    // 게시판 글 삭제
    public int delete(long id);

    // 게시판 글 수
    public int count();

    // 게시판 전체 내역
    public List<Board> selectAll();

    // 특정 글 선택해서 가져오기
    public Board selectById(long id);

    // 페이지 나누기 -> 현재페이지: page, :size
    public List<Board> selectByLimit();

}
