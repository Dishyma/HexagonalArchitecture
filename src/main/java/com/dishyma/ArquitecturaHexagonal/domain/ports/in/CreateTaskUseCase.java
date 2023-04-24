package com.dishyma.ArquitecturaHexagonal.domain.ports.in;

import com.dishyma.ArquitecturaHexagonal.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
