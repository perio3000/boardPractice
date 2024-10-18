package com.example.boardpractice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 전략
    @Column(name = "ID", nullable = false) // 컬럼 매핑
    private Long id;

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "CONTENT", nullable = false)
    @Lob // CLOB 타입에 해당하는 매핑
    private String content;

    @Column(name = "AUTHOR", nullable = false, length = 50)
    private String author;

    @Column(name = "MEMBER_ID", nullable = false)
    private Long memberId;

}
