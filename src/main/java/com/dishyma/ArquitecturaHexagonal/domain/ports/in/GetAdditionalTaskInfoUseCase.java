package com.dishyma.ArquitecturaHexagonal.domain.ports.in;

import com.dishyma.ArquitecturaHexagonal.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);

}
