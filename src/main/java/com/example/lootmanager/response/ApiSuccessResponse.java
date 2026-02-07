package com.example.lootmanager.response;

import java.time.LocalDateTime;

public class ApiSuccessResponse<T> {

    private boolean success;
    private String message;
    private T data;
    private String path;
    private LocalDateTime timestamp;

    // Construtor base
    public ApiSuccessResponse(boolean success, String message, T data, String path) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    // ====== FACTORY METHODS (padrão profissional) ======

    // 200 OK
    public static <T> ApiSuccessResponse<T> ok(T data, String path) {
        return new ApiSuccessResponse<>(
                true,
                "Operação realizada com sucesso",
                data,
                path
        );
    }

    // 201 CREATED
    public static <T> ApiSuccessResponse<T> created(T data, String path) {
        return new ApiSuccessResponse<>(
                true,
                "Recurso criado com sucesso",
                data,
                path
        );
    }

    // 204 NO CONTENT (quando quiser usar no futuro)
    public static <T> ApiSuccessResponse<T> noContent(String path) {
        return new ApiSuccessResponse<>(
                true,
                "Operação realizada com sucesso",
                null,
                path
        );
    }

    // ====== GETTERS ======

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getPath() {
        return path;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
