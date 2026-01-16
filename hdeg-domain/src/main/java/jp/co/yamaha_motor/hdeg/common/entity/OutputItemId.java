package jp.co.yamaha_motor.hdeg.common.entity;

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
@EqualsAndHashCode(of = { "userId", "compId", "compTableId", "columnId" })
public class OutputItemId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String compId;
    private String compTableId;
    private String columnId;
}
