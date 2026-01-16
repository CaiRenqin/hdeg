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
@EqualsAndHashCode(of = { "sectionPartId", "tableId", "compId", "compTableId" })
public class PartTableLnkId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String sectionPartId; // セクション・部位部品ID
    private String tableId; // テーブルID
    private String compId; // 構成ID
    private String compTableId; // 構成内ID
}
