package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "table_info", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class TableInfoEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "table_id", nullable = false, length = 10)
    private String tableId; // テーブルID

    @Column(name = "table_nm_j", nullable = false, length = 50)
    private String tableNmJ; // テーブル名日本語

    @Column(name = "table_nm_e", nullable = false, length = 50)
    private String tableNmE; // テーブル名英語

    @Column(name = "table_type", precision = 1)
    private Integer tableType; // テーブル種類

    @Column(name = "sort_id", precision = 4)
    private Integer sortId; // 表示順

    @Column(name = "enable_flg", precision = 1)
    private Integer enableFlg; // 有効

    @Column(name = "real_table_flg", nullable = false, precision = 1)
    private Integer realTableFlg; // 実テーブルフラグ

    @Column(name = "part_flg", precision = 1)
    private Integer partFlg; // 部品フラグ
}