package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "part", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class PartEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "part_id", nullable = false, length = 20)
    private String partId;// 部品ID

    @Column(name = "part_no", length = 40)
    private String partNo; // 部品番号

    @Column(name = "rev", length = 2)
    private String rev; // リビジョン

    @Column(name = "planning", precision = 1, scale = 0)
    private Integer planning; // 検討中

    @Column(name = "active", precision = 1, scale = 0)
    private Integer active; // アクティブ

    @Column(name = "base_part_id", length = 20)
    private String basePartId; // コピー元部品ID

    @Column(name = "mass", length = 255)
    private String mass; // 質量

    @Column(name = "massmethod_id", length = 3)
    private String massmethodId; // 質量種別ID

    @Column(name = "model4newparts", length = 10)
    private String model4newparts; // 新作時登録型式

    @Column(name = "phase4newparts", length = 3)
    private String phase4newparts; // 新作時次元

    @Column(name = "specs_last_update_user", length = 10)
    private String specsLastUpdateUser; // 諸元最終更新者

    @Column(name = "specs_last_update_date", columnDefinition = "timestamp(6)")
    private LocalDateTime specsLastUpdateDate; // 諸元最終更新日
}
