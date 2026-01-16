package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.CompDataLnkEntity;
import jp.co.yamaha_motor.hdeg.common.entity.CompDataLnkId;

@Repository
public interface CompDataLnkRepository extends JpaRepository<CompDataLnkEntity, CompDataLnkId> {
}
