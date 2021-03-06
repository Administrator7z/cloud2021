package top.zouz.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: zdy
 * @Date: 2021/5/12 13:13
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
