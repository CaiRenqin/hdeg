package jp.co.yamaha_motor.eg.domain.facade.hdegz12;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.yamaha_motor.eg.domain.dto.hdegz12.VersionResponseDTO;
import jp.co.yamaha_motor.eg.domain.service.hdegz12.VersionService;

@Component
@RequiredArgsConstructor
public class VersionFacade {

    private final VersionService myService;

    public List<VersionResponseDTO> getLatestVersion() {
        return myService.getLatestVersion();
    }

}
