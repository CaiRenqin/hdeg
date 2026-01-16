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
@Table(name = "same_component", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SameComponentEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverrides({
            @AttributeOverride(name = "sameComponentId", column = @Column(name = "same_component_id", nullable = false, length = 10)), // 同一構成ID
            @AttributeOverride(name = "compId", column = @Column(name = "comp_id", nullable = false, length = 10)) }) // 構成ID
    private SameComponentId sameComponentId;
}