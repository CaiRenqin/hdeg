package jp.co.yamaha_motor.eg.common.service.hdegz12;

import jp.co.yamaha_motor.eg.dto.hdegz12.VersionResponseDTO;
import jp.co.yamaha_motor.eg.common.entity.VersionEntity;
import jp.co.yamaha_motor.eg.common.repository.hdegz12.VersionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VersionService {

    private final VersionRepository versionRepository;

    public List<VersionResponseDTO> getLatestVersion() {
        VersionEntity entity = versionRepository.findFirstByOrderByLastUpdatedDesc();
        List<VersionEntity> entityList = Collections.singletonList(entity);

        return entityList.stream().map(this::convertEntityToDTO).toList();
    }

    private VersionResponseDTO convertEntityToDTO(VersionEntity entity) {
        VersionResponseDTO dto = new VersionResponseDTO();

        dto.setMajorVer(entity.getVersionId().getMajorVer());
        dto.setMinorVer(entity.getVersionId().getMinorVer());
        dto.setReleaseVer(entity.getVersionId().getReleaseVer());

        // if (entity.getLastUpdated() != null) {
        // dto.setUpdateDate(entity.getLastUpdated().format(
        // java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")));
        // }

        if (entity.getLastUpdated() != null) {
            String formatted = entity.getLastUpdated().format(
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
            dto.setUpdateDate(new VersionResponseDTO.SqlTimestamp(formatted));
        }

        return dto;
    }
}