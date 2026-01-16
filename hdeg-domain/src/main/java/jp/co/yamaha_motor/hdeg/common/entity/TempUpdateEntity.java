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
@Table(name = "temp_update", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(callSuper = false)
public class TempUpdateEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "data_id", nullable = false, length = 5)
    private String dataId; // データID

    @Column(name = "value1", length = 4000)
    private String value1; // 更新値1

    @Column(name = "value2", length = 4000)
    private String value2; // 更新値2

    @Column(name = "value3", length = 4000)
    private String value3; // 更新値3
}