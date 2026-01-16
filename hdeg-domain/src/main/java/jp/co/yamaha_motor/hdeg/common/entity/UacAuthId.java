package jp.co.yamaha_motor.hdeg.common.entity;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "groupId", "userId" })
public class UacAuthId implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String groupId; // グループID
    private String userId; // ユーザーID
}