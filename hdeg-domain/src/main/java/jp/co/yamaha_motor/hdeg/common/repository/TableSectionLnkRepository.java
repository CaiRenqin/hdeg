package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.TableSectionLnkEntity;
import jp.co.yamaha_motor.hdeg.common.entity.TableSectionLnkId;

@Repository
public interface TableSectionLnkRepository extends JpaRepository<TableSectionLnkEntity, TableSectionLnkId> {
}
