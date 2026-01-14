package jp.co.yamaha_motor.hdeg.hdeg.hdegz13.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import jp.co.yamaha_motor.hdeg.common.entity.NumberingEntity;
import jp.co.yamaha_motor.hdeg.hdeg.hdegz13.repository.HDEGZ13UpdateSheetNumberingRepository;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HDEGZ13UpdateSheetNumberingService {
    private final HDEGZ13UpdateSheetNumberingRepository myRepository;

    private static final Map<String, Integer> TABLE_NAME_MAP = new HashMap<>();
    static {
        TABLE_NAME_MAP.put("PRODUCT", 6);
        TABLE_NAME_MAP.put("COMPONENT_DATA", 6);
        TABLE_NAME_MAP.put("DATA", 7);
        TABLE_NAME_MAP.put("PART", 7);
        TABLE_NAME_MAP.put("MODEL", 4);
    }

    private String fillZero(int num, int map) {
        String formatPattern = String.format("%%0%dd", map);
        return String.format(formatPattern, num);
    }

    @Transactional
    public String updateNumberingBySave(String tableName) {
        NumberingEntity numbering = myRepository.findByTableName(tableName);
        numbering.setNum(numbering.getNum() + 1);
        myRepository.save(numbering);

        String fullNum = fillZero(numbering.getNum(), TABLE_NAME_MAP.get(tableName));

        return numbering.getPrefix() + fullNum;

    }
}
