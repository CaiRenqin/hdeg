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
@Table(name = "temp_model_disp", schema = "egdb")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@ToString()
@EqualsAndHashCode(callSuper = false)
public class TempModelDispEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "model_id", length = 10)
    private String modelId; // モデルID

    @Column(name = "model", length = 50)
    private String model; // 登録型式

    @Column(name = "project_no", length = 50)
    private String projectNo; // プロジェクトNo

    @Column(name = "model_name", length = 10)
    private String modelName; // 機種名

    @Column(name = "model_year", length = 4)
    private String modelYear; // モデル年度

    @Column(name = "kickoff_date", length = 10)
    private String kickoffDate; // KickOff年度

    @Column(name = "maker_other_nm", length = 20)
    private String makerOtherNm; // その他メーカー名称

    @Column(name = "maker_other_flg", precision = 1)
    private Integer makerOtherFlg; // 他社フラグ

    @Column(name = "development_flg", precision = 1)
    private Integer developmentFlg; // 開発中フラグ

    @Column(name = "model_disp", length = 100)
    private String modelDisp; // 表示モデル名
}