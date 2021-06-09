package xyz.hcworld.rpc.annotation;

/**
 * 注入远程服务注解（消费者）
 * @ClassName: AdventureReference
 * @Author: 张红尘
 * @Date: 2021-06-09
 * @Version： 1.0
 */
public @interface AdventureReference {
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
