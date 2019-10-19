package club.ohoho.common.vo;

import club.ohoho.common.exceptions.OhohoException;
import lombok.Getter;
import org.joda.time.DateTime;

/**
 * @Author Ohoho
 * @Date 2019/10/19 0019 17:40
 * @Since 1.0.0
 */
@Getter
public class ExceptionResult {
    private int status;
    private String message;
    private String timestamp;

    public ExceptionResult(OhohoException e) {
        this.status = e.getStatus();
        this.message = e.getMessage();
        this.timestamp = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
    }
}