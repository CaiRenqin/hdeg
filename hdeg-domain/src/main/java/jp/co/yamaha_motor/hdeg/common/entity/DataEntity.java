package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "data", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class DataEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "dataId", column = @Column(name = "data_id", nullable = false, length = 20)) // データID
    @AttributeOverride(name = "tableId", column = @Column(name = "table_id", nullable = false, length = 10)) // テーブルID
    @AttributeOverride(name = "columnId", column = @Column(name = "column_id", nullable = false, length = 5)) // カラムID
    private DataEntityId dataEntityId;

    @Column(name = "data", length = 500)
    private String data;// 値

    @Column(name = "ref_data_id", length = 20)
    private String refDataId; // 外部参照データID

    @Column(name = "ref_column_id", length = 5)
    private String refColumnId;// 外部参照カラムＩＤ

    @Column(name = "batch_update_date", columnDefinition = "timestamp(6)")
    private LocalDateTime batchUpdateDate;// バッチ更新日時
}
