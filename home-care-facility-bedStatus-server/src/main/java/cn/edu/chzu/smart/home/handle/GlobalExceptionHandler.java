package cn.edu.chzu.smart.home.handle;



import cn.edu.chzu.smart.home.exception.GolbalException;
import cn.edu.chzu.smart.home.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理器
 * 拷贝auth
 *
 * @author: hxy
 * @date: 2018/06/14
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GolbalException.class)
    @ResponseBody
    public ResultVO handlerSellerException(GolbalException e) {

        return ResultVO.error(e.getCode(),
                e.getMessage());
    }

}
