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
@Table(name = "specs_relation", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SpecsRelationEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "input_item_code", nullable = false, length = 10)
    private String inputItemCode; // 入力項目ID

    @Column(name = "comp_id", nullable = false, length = 10)
    private String compId; // 構成ID

    @Column(name = "comp_table_id", nullable = false, length = 5)
    private String compTableId; // 構成内ID

    @Column(name = "table_id", nullable = false, length = 10)
    private String tableId; // テーブルID

    @Column(name = "column_id", nullable = false, length = 5)
    private String columnId; // カラムID
}