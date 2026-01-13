package jp.co.yamaha_motor.eg.hdeg.hdegz13.dto;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "resultSet")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HDEGZ13UpdateSheetNumberingRespondDTO {
    @XmlElement(name = "row")
    private RowData row;

    public HDEGZ13UpdateSheetNumberingRespondDTO(String numberingId) {
        this.row = new RowData(numberingId);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class RowData {
        @XmlElement(name = "numberingId")
        private String numberingId;
    }
}