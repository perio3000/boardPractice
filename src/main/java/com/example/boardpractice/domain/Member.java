package com.example.boardpractice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(name = "member_seq", sequenceName = "member_seq", allocationSize = 1)
    private long id;

    @Column(name = "NAME", nullable = false, length = 20)
    private String name;

    @Column(name = "MAIL", nullable = false, length = 100)
    private String mail;

    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;

    // 기본 생성자
    public Member() {
    }
}
