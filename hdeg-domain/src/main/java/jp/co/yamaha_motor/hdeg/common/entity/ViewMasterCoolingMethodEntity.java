package jp.co.yamaha_motor.hdeg.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_master_cooling_method", schema = "egdb")
public class ViewMasterCoolingMethodEntity extends ViewBaseEntity {
}