package jp.co.yamaha_motor.eg.hdeg.hdegz13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.eg.common.entity.NumberingEntity;

@Repository
public interface HDEGZ13UpdateSheetNumberingRepository extends JpaRepository<NumberingEntity, String> {
    NumberingEntity findByTableName(String tableName);
}
