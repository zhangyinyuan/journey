# 使用过程中几个注意的点

- 版本问题

> spring-boot 的版本

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.10.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

> 继承的 es pom

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
</dependency>
```

> 服务端安装的es版本
```
elasticsearch:2.3.5
```

- 安装 es

> es的端口默认为:Java API调用时使用9300,Web控制台访问时为9200,所以需要开放这两个端口 
 
> 需要额外的安装插件 elasticsearch-head ,用于web控制台查看es相关信息