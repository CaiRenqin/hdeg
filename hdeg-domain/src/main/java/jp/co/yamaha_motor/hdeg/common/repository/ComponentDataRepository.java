package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.ComponentDataEntity;
import jp.co.yamaha_motor.hdeg.common.entity.ComponentDataId;

@Repository
public interface ComponentDataRepository extends JpaRepository<ComponentDataEntity, ComponentDataId> {
}
