package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Immutable
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public abstract class ViewBaseEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id", nullable = false, length = 500)
    private String id;

    @Column(name = "name", length = 500)
    private String name;

    @Column(name = "identifer", length = 500)
    private String identifer;
}