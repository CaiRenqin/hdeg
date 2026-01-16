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
@Table(name = "temp_update_t0280", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(callSuper = false)
public class TempUpdateT0280Entity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "data_id", nullable = false, length = 20)
    private String dataId; // データID

    @Column(name = "table_id", length = 10)
    private String tableId; // テーブルID

    @Column(name = "data1", length = 255)
    private String data1; // 更新データ1

    @Column(name = "data2", length = 255)
    private String data2; // 更新データ2
}