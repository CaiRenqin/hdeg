package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "part_table_lnk", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class PartTableLnkEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverrides({
            @AttributeOverride(name = "sectionPartId", column = @Column(name = "section_part_id", nullable = false, length = 5)), // セクション・部位部品ID
            @AttributeOverride(name = "tableId", column = @Column(name = "table_id", nullable = false, length = 10)), // テーブルID
            @AttributeOverride(name = "compId", column = @Column(name = "comp_id", nullable = false, length = 10)), // 構成ID
            @AttributeOverride(name = "compTableId", column = @Column(name = "comp_table_id", nullable = false, length = 5)) }) // 構成内ID
    private PartTableLnkId partTableLnkId;

    @Column(name = "column_id", length = 5)
    private String columnId; // カラムID

    @Column(name = "table_type", nullable = false, precision = 1)
    private Integer tableType; // テーブル種類

    @Column(name = "sort_id", precision = 4)
    private Integer sortId; // 表示順

}