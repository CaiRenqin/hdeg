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
@Table(name = "uac_auth", schema = CommonConstants.SCHEMA)
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class UacAuthEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @EqualsAndHashCode.Include
    @AttributeOverride(name = "groupId", column = @Column(name = "group_id", nullable = false, length = 9)) // グループID
    @AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 9)) // ユーザーID
    private UacAuthId uacAuthId;

    @Column(name = "user_nm", length = 60)
    private String userNm; // ユーザー名

    @Column(name = "org_id", nullable = false, length = 8)
    private String orgId; // 所属ID

    @Column(name = "org_nm", length = 40)
    private String orgNm; // 所属名称
}