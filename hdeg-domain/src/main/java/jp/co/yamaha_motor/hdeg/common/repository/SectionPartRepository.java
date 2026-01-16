package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.SectionPartEntity;

@Repository
public interface SectionPartRepository extends JpaRepository<SectionPartEntity, String> {
}
