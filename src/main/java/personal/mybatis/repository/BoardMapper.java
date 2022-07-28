package personal.mybatis.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import personal.mybatis.model.Board;

import java.util.List;


@Mapper
public interface BoardMapper {

    // 게시판 글 추가
    public int insert(Board board) throws Exception;

    // 게시판 글 업데이트
    public int update(Board board) throws Exception;

    // 게시판 글 삭제
    public int delete(long id) throws Exception;

    // 게시판 글 수
    public int count() throws Exception;

    // 게시판 전체 내역
    public List<Board> selectAll() throws Exception;

    // 특정 글 선택해서 가져오기
    public Board selectById(long id) throws Exception;

    // 페이지 나누기 -> 현재페이지: page,  페이지당 개시물의 개수 :size
    public List<Board> selectByLimit(@Param("page") int page ,
                                     @Param("size") int size) throws Exception;

    public int increment(@Param("id") long id , @Param("requester") String



}
