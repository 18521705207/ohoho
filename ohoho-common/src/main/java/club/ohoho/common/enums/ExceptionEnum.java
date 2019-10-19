package club.ohoho.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Heimdall
 */

@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    /**
     * 价格不能为空
     */
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！");;
    private int value;
    private String msg;

    public int value() {
        return this.value;
    }

    public String msg() {
        return this.msg;
    }
}