package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "column_info", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ColumnInfoEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "tableId", column = @Column(name = "table_id", nullable = false, length = 10)) // テーブルID
    @AttributeOverride(name = "columnId", column = @Column(name = "column_id", nullable = false, length = 5)) // カラムID
    private ColumnInfoId columnInfoId;

    @Column(name = "column_nm_j", length = 100)
    private String columnNmJ;// カラム名日本語

    @Column(name = "column_nm_e", length = 50)
    private String columnNmE;// カラム名英語

    @Column(name = "column_nm_j2", length = 30)
    private String columnNmJ2;// カラム名日本語２

    @Column(name = "column_kind1", length = 150)
    private String columnKind1;// 分類1

    @Column(name = "column_kind2", length = 200)
    private String columnKind2;// 分類2

    @Column(name = "measure_kind", length = 20)
    private String measureKind;// 寸法種類

    @Column(name = "column_unit", length = 20)
    private String columnUnit;// 表示単位

    @Column(name = "column_type", length = 20)
    private String columnType;// 型

    @Column(name = "column_size", precision = 10, scale = 0)
    private Integer columnSize;// サイズ

    @Column(name = "master_table_id", length = 10)
    private String masterTableId;// マスターテーブルID

    @Column(name = "data_type", precision = 1, scale = 0)
    private Integer dataType;// データ種類

    @Column(name = "disp_flg", precision = 1, scale = 0)
    private Integer dispFlg;// 表示区分

    @Column(name = "sort_id", precision = 4, scale = 0)
    private Integer sortId;// 表示順

    @Column(name = "enable_flg", precision = 1, scale = 0)
    private Integer enableFlg;// 有効
}
