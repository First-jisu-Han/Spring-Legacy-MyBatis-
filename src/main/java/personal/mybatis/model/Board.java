package personal.mybatis.model;

import lombok.Data;

import java.util.Date;


// DTO
@Data
public class Board {
    private long id;   // 작성자 serial number
    private String writer;  // 작성자
    private String title; // 제목
    private String content; // 내용
    private Date regDate;  // 등록일자
    private long hitCount; // 조회수

}


