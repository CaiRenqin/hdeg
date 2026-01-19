package jp.co.yamaha_motor.hdeg.common.entity;

import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_master_maker", schema = CommonConstants.SCHEMA)
public class ViewMasterMakerEntity extends ViewBaseEntity {
}