package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.SameComponentEntity;
import jp.co.yamaha_motor.hdeg.common.entity.SameComponentId;

@Repository
public interface SameComponentRepository extends JpaRepository<SameComponentEntity, SameComponentId> {
}
