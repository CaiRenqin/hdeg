package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "model", "inputItemCode", "approvalDate" })
public class SpecsModelInfoTempId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String model; // 登録型式
    private String inputItemCode; // 入力項目ID
    private LocalDateTime approvalDate; // 承認日
}