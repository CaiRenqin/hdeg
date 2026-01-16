package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.yamaha_motor.hdeg.common.entity.ComponentEntity;
import jp.co.yamaha_motor.hdeg.common.entity.ComponentId;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentEntity, ComponentId> {
}
