package org.mule.extension.databaseaudit.internal.utils;

public enum LogLevels {
    DEBUG(0),  TRACE(1),  INFO(2), WARN(
            3), ERROR(4);

    private final int code;

    LogLevels(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
