package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.UacAuthEntity;
import jp.co.yamaha_motor.hdeg.common.entity.UacAuthId;

@Repository
public interface UacAuthRepository extends JpaRepository<UacAuthEntity, UacAuthId> {
}
