package com.lft.linetable;
/*自定义异常*/
public class MyArrayIndexOutOfBoundsException extends RuntimeException {
    public MyArrayIndexOutOfBoundsException() {
        super();
    }

    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
