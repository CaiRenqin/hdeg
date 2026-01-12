package jp.co.yamaha_motor.eg.hdeg.hdegz12.facade;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.yamaha_motor.eg.hdeg.hdegz12.dto.VersionResponseDTO;
import jp.co.yamaha_motor.eg.hdeg.hdegz12.service.VersionService;

@Component
@RequiredArgsConstructor
public class VersionFacade {

    private final VersionService myService;

    public List<VersionResponseDTO> getLatestVersion() {
        return myService.getLatestVersion();
    }

}
