package io.servicecomb.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.servicecomb.demo.Hello;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.pojo.RpcReference;

@Component
public class HelloConsumerMain {
    private static final Logger logger = LoggerFactory.getLogger(HelloConsumerMain.class);

    @RpcReference(microserviceName = "hello", schemaId = "hello")
    private static Hello hello;

    public static void main(String[] args)
        throws Exception {
        init();
        String separator = "*******************************";
        logger.info(separator+"ServiceComb test success: "+hello.sayHi("Java Chassis")+separator);
    }

    public static void init()
        throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }

}
