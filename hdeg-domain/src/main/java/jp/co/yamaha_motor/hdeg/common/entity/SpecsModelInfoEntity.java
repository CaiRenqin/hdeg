package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "specs_model_info", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SpecsModelInfoEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverrides({
            @AttributeOverride(name = "model", column = @Column(name = "model", nullable = false, length = 10)), // 登録型式
            @AttributeOverride(name = "inputItemCode", column = @Column(name = "input_item_code", nullable = false, length = 10)) }) // 入力項目ID
    private SpecsModelInfoId specsModelInfoId;

    @Column(name = "approval_date", columnDefinition = "timestamp(6)")
    private LocalDateTime approvalDate; // 承認日

    @Column(name = "input_value", length = 4000)
    private String inputValue; // 入力値
}