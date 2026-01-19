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
import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "comp_data_lnk", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class CompDataLnkEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "productId", column = @Column(name = "product_id", nullable = false, length = 20)) // プロダクトID
    @AttributeOverride(name = "compId", column = @Column(name = "comp_id", nullable = false, length = 10)) // 構成ID
    @AttributeOverride(name = "compDataId", column = @Column(name = "comp_data_id", nullable = false, length = 20)) // 構成データID
    private CompDataLnkId compDataLnkId;
}