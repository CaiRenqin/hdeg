package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.DataEntity;
import jp.co.yamaha_motor.hdeg.common.entity.DataInfoId;

@Repository
public interface DataEntityRepository extends JpaRepository<DataEntity, DataInfoId> {
}
