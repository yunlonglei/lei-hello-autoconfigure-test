# lei-hello-autoconfigure-test
测试使用自定义的SpringBoot(starter)启动器

## 使用启动器
1.添加依赖
```xml
<dependency>
    <groupId>com.lei</groupId>
    <artifactId>lei-hello-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
2.注入使用
```java
@Autowired
HelloService helloService;
```
3.自定义starter属性
```java
@Configuration
public class HelloConfig {
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setName("erlei");
        helloService.setAge(18);
        return  helloService;
    }
}
```