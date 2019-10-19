package club.ohoho.common.advice;

import club.ohoho.common.exceptions.OhohoException;
import club.ohoho.common.vo.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author Ohoho
 * @Date 2019/10/19 0019 17:40
 * @Since 1.0.0
 */
@ControllerAdvice
@Slf4j
public class BasicExceptionHandler {

    @ExceptionHandler(OhohoException.class)
    public ResponseEntity<ExceptionResult> handleException(OhohoException e){
        // 返回结果
        return ResponseEntity.status(e.getStatus()).body(new ExceptionResult(e));
    }

}