package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.SpecsModelInfoTempEntity;
import jp.co.yamaha_motor.hdeg.common.entity.SpecsModelInfoTempId;

@Repository
public interface SpecsModelInfoTempRepository extends JpaRepository<SpecsModelInfoTempEntity, SpecsModelInfoTempId> {
}
