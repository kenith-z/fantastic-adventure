package xyz.hcworld.rpc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 提供远程服务注解（生产者）
 *
 * @ClassName: AdventureService
 * @Author: 张红尘
 * @Date: 2021-06-09
 * @Version： 1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface AdventureService {

    /**
     * 服务名
     *
     * @return 服务名
     */
    String interfaceName() default "";

    /**
     * 服务版本
     *
     * @return 服务版本
     */
    String version() default "";
}
