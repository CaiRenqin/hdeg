package jp.co.yamaha_motor.hdeg.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_master_product_category", schema = "egdb")
public class ViewMasterProductCategoryEntity extends ViewBaseEntity {
}