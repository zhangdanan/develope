package cn.edu.chzu.smart.home.vo;

import cn.edu.chzu.smart.home.enums.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 结果vo
 *
 * @author: EarthChen
 * @date: 2018/06/02
 */
@Data
@ApiModel(description = "返回结果model")
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -5897234194040793245L;

    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码:\n成功:0；失败:其他状态码", name = "code", required = true, example = "0")
    private Integer code;

    /**
     * 状态码信息
     */
    @ApiModelProperty(value = "状态码信息", name = "msg", required = true, example = "成功")
    private String msg;

    /**
     * 具体信息
     */
    @ApiModelProperty(value = "不同模块返回数据", name = "data", required = true)
    private T data;


    public static <T> ResultVO<T> success(T object) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static <T> ResultVO<T> error(Integer code, String msg) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static <T> ResultVO<T> error(ResultEnum resultEnum) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMessage());
        return resultVO;
    }
}