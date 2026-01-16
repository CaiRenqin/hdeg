package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.SpecsModelInfoEntity;
import jp.co.yamaha_motor.hdeg.common.entity.SpecsModelInfoId;

@Repository
public interface SpecsModelInfoRepository extends JpaRepository<SpecsModelInfoEntity, SpecsModelInfoId> {
}
