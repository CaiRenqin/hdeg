package jp.co.yamaha_motor.eg.hdeg.hdegz13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import jp.co.yamaha_motor.eg.common.entity.NumberingEntity;

@Repository
public interface HDEGZ13UpdateSheetNumberingRepository extends JpaRepository<NumberingEntity, String> {
    NumberingEntity findByTableName(String tableName);

    // @Modifying
    // @Transactional
    // @Query(value = "UPDATE egdb.numbering " +
    // "SET num = num + 1, update_counter = update_counter + 1 " +
    // "WHERE table_name = :tableName FOR UPDATE", nativeQuery = true)
    // int incrementNumAndUpdateCounter(@Param("tableName") String tableName);
}
