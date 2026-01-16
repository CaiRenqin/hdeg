package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.PartTableLnkEntity;
import jp.co.yamaha_motor.hdeg.common.entity.PartTableLnkId;

@Repository
public interface PartTableLnkRepository extends JpaRepository<PartTableLnkEntity, PartTableLnkId> {
}
