package com.dishyma.ArquitecturaHexagonal.domain.ports.in;

import com.dishyma.ArquitecturaHexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
