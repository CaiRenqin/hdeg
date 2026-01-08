package jp.co.yamaha_motor.eg.common.facade.hdegz12;

import jp.co.yamaha_motor.eg.dto.hdegz12.VersionResponseDTO;
import jp.co.yamaha_motor.eg.common.service.hdegz12.VersionService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VersionFacade {

    private final VersionService versionService;

    public List<VersionResponseDTO> getLatestVersion() {
        return versionService.getLatestVersion();
    }

}
