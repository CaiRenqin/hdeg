package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "section_part", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SectionPartEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "section_part_id", nullable = false, length = 5)
    private String sectionPartId; // セクション・部位部品ID

    @Column(name = "section_id", nullable = false, length = 5)
    private String sectionId; // セクションID

    @Column(name = "item_name", nullable = false, length = 100)
    private String itemName; // 名称

    @Column(name = "sort_id", precision = 4)
    private BigDecimal sortId; // 表示順
}