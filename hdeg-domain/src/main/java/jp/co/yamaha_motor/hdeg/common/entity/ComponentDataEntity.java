package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
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
@Table(name = "component_data", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ComponentDataEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "compDataId", column = @Column(name = "comp_data_id", nullable = false, length = 20)) // 構成データID
    @AttributeOverride(name = "compTableId", column = @Column(name = "comp_table_id", nullable = false, length = 5)) // 構成内ID
    private ComponentDataId componentDataId;

    @Column(name = "data_id", length = 10)
    private String dataId;// データID

    @Column(name = "ref_comp_data_id", length = 20)
    private String refCompDataId;// 参照構成データID
}