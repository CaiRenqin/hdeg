package jp.co.yamaha_motor.eg.common.repository.hdegz12;

import jp.co.yamaha_motor.eg.common.entity.VersionEntity;
import jp.co.yamaha_motor.eg.common.entity.VersionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepository extends JpaRepository<VersionEntity, VersionId> {

    @Query("SELECT v FROM VersionEntity v ORDER BY v.lastUpdated DESC Limit 1")
    VersionEntity findFirstByOrderByLastUpdatedDesc();
}