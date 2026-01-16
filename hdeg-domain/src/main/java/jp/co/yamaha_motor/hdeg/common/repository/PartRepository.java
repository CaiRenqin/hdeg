package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.PartEntity;

@Repository
public interface PartRepository extends JpaRepository<PartEntity, String> {
}
