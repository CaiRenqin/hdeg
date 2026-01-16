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
@EqualsAndHashCode(of = { "sectionId", "tableId" })
public class TableSectionLnkId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String sectionId; // セクションID
    private String tableId; // テーブルID
}