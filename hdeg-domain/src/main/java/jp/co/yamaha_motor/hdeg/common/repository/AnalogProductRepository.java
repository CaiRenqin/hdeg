package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.AnalogProductEntity;
import jp.co.yamaha_motor.hdeg.common.entity.AnalogProductId;

@Repository
public interface AnalogProductRepository extends JpaRepository<AnalogProductEntity, AnalogProductId> {
}
