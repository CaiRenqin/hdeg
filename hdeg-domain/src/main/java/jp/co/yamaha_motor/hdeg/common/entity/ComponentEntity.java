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
@Table(name = "component", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ComponentEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "compId", column = @Column(name = "comp_id", nullable = false, length = 10)) // 構成ID
    @AttributeOverride(name = "compTableId", column = @Column(name = "comp_table_id", nullable = false, length = 5)) // 構成内ID
    private ComponentId componentId;

    @Column(name = "parent_id", length = 10)
    private String parentId;// 親ID

    @Column(name = "name_id", length = 10)
    private String nameId;// 構成内名称ID

    @Column(name = "table_id", length = 10)
    private String tableId;// テーブルID

    @Column(name = "ref_table_id", length = 10)
    private String refTableId;// 参照構成ID

    @Column(name = "sort_id", precision = 1, scale = 0)
    private Integer sortId;// 表示順

    @Column(name = "column_nm_j", precision = 1, scale = 0)
    private Integer columnNmJ;// 有効
}