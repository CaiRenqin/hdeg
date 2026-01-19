package jp.co.yamaha_motor.hdeg.common.entity;

import jp.co.yamaha_motor.hdeg.common.constants.CommonConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_master_massmethod", schema = CommonConstants.SCHEMA)
public class ViewMasterMassmethodEntity extends ViewBaseEntity {
}