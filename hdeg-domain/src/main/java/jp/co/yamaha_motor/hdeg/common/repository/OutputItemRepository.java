package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.OutputItemEntity;
import jp.co.yamaha_motor.hdeg.common.entity.OutputItemId;

@Repository
public interface OutputItemRepository extends JpaRepository<OutputItemEntity, OutputItemId> {
}
