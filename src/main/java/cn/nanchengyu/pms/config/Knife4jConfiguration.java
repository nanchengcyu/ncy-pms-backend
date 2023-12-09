package cn.nanchengyu.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


/**
 * ClassName: Knife4jConfiguration
 * Package: cn.nanchengyu.pms.config
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/9 20:30
 * @Version 1.0
 */
//@Profile("dev") //设置接口文档生效环境
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("pms伙伴配匹配系统 RESTful APIs")
                        .description("# swagger-bootstrap-ui-demo RESTful APIs")
                        .termsOfServiceUrl("https://mp.weixin.qq.com/s/hbpMZs_qY0rdZPLARJo7Hw")
                        .contact("nanchengyu02@qq.com")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("1.0版本")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("cn.nanchengyu.pms.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}