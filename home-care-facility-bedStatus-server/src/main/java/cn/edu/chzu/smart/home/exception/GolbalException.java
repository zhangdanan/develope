package cn.edu.chzu.smart.home.exception;


import cn.edu.chzu.smart.home.enums.ResultEnum;
import lombok.Getter;

/**
 * @author wangqianlong
 * @create 2018-09-14 19:58
 */
@Getter
public class GolbalException extends RuntimeException {
    private static final long serialVersionUID = 5342609240774296994L;

    private Integer code;

    public GolbalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public GolbalException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
