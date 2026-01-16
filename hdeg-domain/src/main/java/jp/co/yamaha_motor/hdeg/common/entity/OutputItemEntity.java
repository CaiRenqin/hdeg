package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serializable;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "output_item", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class OutputItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverrides({
            @AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 9)), // ユーザーID
            @AttributeOverride(name = "compId", column = @Column(name = "comp_id", nullable = false, length = 10)), // 構成ID
            @AttributeOverride(name = "compTableId", column = @Column(name = "comp_table_id", nullable = false, length = 5)), // 構成内ID
            @AttributeOverride(name = "columnId", column = @Column(name = "column_id", nullable = false, length = 5)) }) // カラムID
    private OutputItemId outputItemId;

    @Column(name = "data_type", precision = 1, scale = 0)
    private Boolean dataType;// データ種類

    @Column(name = "sort_id", precision = 4, scale = 0)
    private Short sortId;// 表示順
}
