package jp.co.yamaha_motor.eg.hdeg.hdegz13.facade;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import jp.co.yamaha_motor.eg.hdeg.hdegz13.service.HDEGZ13UpdateSheetNumberingService;

@Component
@RequiredArgsConstructor
public class HDEGZ13UpdateSheetNumberingFacade {
    private final HDEGZ13UpdateSheetNumberingService myService;

    public String updateSheetNumbering(String tableName) {
        return myService.updateNumberingBySave(tableName);
    }
}
