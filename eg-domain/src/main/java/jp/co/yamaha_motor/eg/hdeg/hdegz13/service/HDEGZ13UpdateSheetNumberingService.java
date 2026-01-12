package jp.co.yamaha_motor.eg.hdeg.hdegz13.service;

import org.springframework.stereotype.Service;

import jp.co.yamaha_motor.eg.common.entity.NumberingEntity;
import jp.co.yamaha_motor.eg.hdeg.hdegz13.repository.HDEGZ13UpdateSheetNumberingRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class HDEGZ13UpdateSheetNumberingService {
    private HDEGZ13UpdateSheetNumberingRepository myRepository;

    @Transactional
    public NumberingEntity updateNumberingBySave(String tableName) {
        NumberingEntity numbering = myRepository.findByTableName(tableName);

        numbering.setNum(numbering.getNum() + 1);

        myRepository.save(numbering);

        return numbering;
    }
}
