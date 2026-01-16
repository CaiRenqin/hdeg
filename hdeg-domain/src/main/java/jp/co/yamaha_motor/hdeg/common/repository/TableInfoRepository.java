package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.TableInfoEntity;

@Repository
public interface TableInfoRepository extends JpaRepository<TableInfoEntity, String> {
    /**
     * テーブルIDからテーブル名英語を取得
     *
     * @param tableId テーブルID
     * @return テーブル名英語
     */
    @Query("SELECT t.tableNmE FROM TableInfoEntity t WHERE t.tableInfoId.tableId = :tableId")
    String getTableNameByTableID(String tableId);
}
