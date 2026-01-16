package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "temp_update_campro2", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(callSuper = false)
public class TempUpdateCampro2Entity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "product_id", nullable = false, length = 20)
    private String productId; // プロダクトID

    @Column(name = "comp_id", length = 20)
    private String compId; // 構成ID

    @Column(name = "comp_data_id", length = 20)
    private String compDataId; // 構成データID

    @Column(name = "comp_table_id", length = 20)
    private String compTableId; // 構成内ID
}