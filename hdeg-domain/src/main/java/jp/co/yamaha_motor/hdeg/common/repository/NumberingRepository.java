package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.NumberingEntity;

@Repository
public interface NumberingRepository extends JpaRepository<NumberingEntity, String> {
    NumberingEntity findByTableName(String tableName);
}
