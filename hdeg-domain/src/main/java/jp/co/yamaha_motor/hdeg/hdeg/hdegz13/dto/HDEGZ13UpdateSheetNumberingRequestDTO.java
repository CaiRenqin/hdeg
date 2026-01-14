package jp.co.yamaha_motor.hdeg.hdeg.hdegz13.dto;

import lombok.Data;

@Data
public class HDEGZ13UpdateSheetNumberingRequestDTO {
    private ScreenModel screenModel;

    @Data
    public static class ScreenModel {
        private String tableName;
    }
}
