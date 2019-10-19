package club.ohoho.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author Ohoho
 * @Date 2019/10/19 0019 17:40
 * @Since 1.0.0
 */

@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    // 价格不能为空
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！");

    private int value;
    private String msg;

    public int value() {
        return this.value;
    }

    public String msg() {
        return this.msg;
    }
}