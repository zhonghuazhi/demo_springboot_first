# demo_springboot_first

此工程为springboot基础版，仅说明springboot框架使用

### 工程结构定义
- 启动类
> 常放置于工程Src目录下的跟目录。如此项目在 net.cc.demo_springboot_first目录下。

- 实体类、数据访问层
> 常使用 domain 作为包名称

- 业务逻辑层
> 常使用 service 作为包名称

- web访问层
> 常使用 web 作为包名称


### 多配置文件使用

springboot框架使用 application.properties 来作为项目的配置文件。可在此配置文件中进行相关的属性定义。
当在实际的使用中会区分（开发环境、测试环境、生产环境），我们可以同时将三个不同的环境按照作用域配置到
不同的文件中，在项目启动的时候给予一个显示的指向，即可完成工程项目环境变量的切换。

1. 命名规约：
- 开发环境
> application-dev.properties

- 测试环境
> application-test.properties

- 生产环境
> application-prod.properties


2. 系统指向：
可在application.properties中明确指定需要加载的是哪个配置文件，同时框架还支持在启动时动态加载。

- 默认配置
> 在application.properties文件中使用 spring.profiles.active=dev|test|prod 来进行确定。


- 动态配置
> 在 java -jar  ****.jar --spring.profiles.active=dev|test|prod 来进行确定。


### 配置文件中使用随机数问题

有时会在配置文件中使用随机数的业务场景，springboot支持在配置文件中直接配置随机数。

- 配置随机字符串
```
test.value=${random.value}
```

- 配置随机整形
```
test.int=${random.int}
```

- 配置随机常整形
```
test.long=${random.long}
```

- 配置10以内的随机数
```
test.ints=${random.int(10)}
```

- 配置10-20之间的随机数
```
test.intk=${random.int[10,20]}
```

### 系统内部使用配置文件

在springboot框架中，系统内部的类可直接使用配置文件内容。

```
@Value("${test.value}")
private String value;
```