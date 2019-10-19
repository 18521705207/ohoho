package club.ohoho.common.advice;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class BasicExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(RuntimeException e) {
        // 我们暂定返回状态码为400， 然后从异常中获取友好提示信息
        return ResponseEntity.status(400).body(e.getMessage());
    }
}