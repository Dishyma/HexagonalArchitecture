package com.dishyma.ArquitecturaHexagonal.domain.ports.in;

import com.dishyma.ArquitecturaHexagonal.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTask();
}
