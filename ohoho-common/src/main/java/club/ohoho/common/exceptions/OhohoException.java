package club.ohoho.common.exceptions;

import club.ohoho.common.enums.ExceptionEnum;
import lombok.Getter;

/**
 * @Author Ohoho
 * @Date 2019/10/19 0019 17:40
 * @Since 1.0.0
 */
@Getter
public class OhohoException extends RuntimeException {

    private int status;

    public OhohoException(ExceptionEnum em) {
        super(em.msg());
        this.status = em.value();
    }

    public OhohoException(ExceptionEnum em, Throwable cause) {
        super(em.msg(), cause);
        this.status = em.value();
    }
}
