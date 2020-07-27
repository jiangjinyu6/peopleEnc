package com.example.demo.error;

public class userError extends RuntimeException {
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public userError() {
        super("用户不存在");
    }
}
