package com.bolic.web.common.mybatis.vo;

import groovy.transform.EqualsAndHashCode;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "t_code_mst")
@IdClass(CodePK.class)
public class Code {
    @Id
    @Column(name = "UP_CODE_CD", length = 50)
    private String upCodeCd;
    @Id
    @Column(name = "CODE_CD", length = 50)
    private String codeCd;
    @Column(length = 20)
    private String USE_YN;
    @Column(length = 200)
    private String CODE_NM;
    @Column(length = 500)
    private String CODE_DESC;
    @Column(length = 32)
    private Integer ORDERBY;
    @Column(length = 32)
    private String CREATE_ID;

    private LocalDateTime CREATE_DT;
    @Column(length = 32)
    private String UPDATE_ID;
    private LocalDateTime UPDATE_DT;
}

