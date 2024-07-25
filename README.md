# HyperFusion

HyperFusion 是一个基于 Spring Boot 3 和 Java 21 的自建框架，旨在提供高效、可扩展和易于维护的企业级应用程序。项目集成了
MyBatis Plus、Knife4j、Lombok、Redis、MySQL、Kafka 等热门技术栈，以满足现代企业应用的多样化需求。

## 特性

- **Spring Boot 3**：现代化的微服务框架，简化配置和部署。
- **MyBatis Plus**：增强的 MyBatis 功能，简化 CRUD 操作。
- **Knife4j**：增强版 Swagger UI，用于 API 文档生成和测试。
- **Lombok**：减少样板代码，提高开发效率。
- **Redis**：高性能的键值数据库，用于缓存和会话管理。
- **MySQL**：流行的关系型数据库，数据持久化。
- **Kafka**：高吞吐量的分布式消息系统，处理实时数据流。
- **多数据源**：支持多数据源配置，满足复杂应用场景。
- **Fastjson2**：高性能的 JSON 解析库。
- **Commons Lang3**：Apache 的实用工具类库。
- **Hutool**：Java 工具集，简化开发。

## 目录结构

```java
hyperfusion
        ├── src
        │ ├── main
        │ │ ├── java
        │ │ │ └── com
        │ │ │ └── hyperfusion
        │ │ │ └── app
        │ │ │ │ ├── common
        │ │ │ │ ├── controller
        │ │ │ │ ├── entity
        │ │ │ │ ├── mapper
        │ │ │ │ ├── service
        │ │ │ │ └── HyperFusionApplication.java
        │ │ ├── resources
        │ │ │ ├── application.yml
        │ │ │ ├── application-dev.yml
        │ │ │ ├── application-test.yml
        │ │ │ ├── application-prod.yml
        │ │ │ └── logback-spring.xml
        │ ├── test
        │ └── java
        │ │ └── com
        │ │ └── hyperfusion
        │ │ └── app
        ├── pom.xml
        └── README.md
```

## 安装与使用

### 前置条件

- JDK 21
- Maven 3.6+
- MySQL
- Redis
- Kafka

### 安装步骤

1. 克隆仓库：
    ```sh
    git clone https://github.com/yourusername/hyperfusion.git
    cd hyperfusion
    ```

2. 配置数据库：
    - 修改 `src/main/resources/application-xxx.yml` 文件，配置 MySQL、Redis 和 Kafka 连接信息。

3. 安装依赖并构建项目：
    ```sh
    mvn clean install
    ```

4. 运行应用：
    ```sh
    mvn spring-boot:run
    ```

### API 文档

启动项目后，访问 `http://localhost:8080/doc.html` 查看 API 文档（由 Knife4j 生成）。

## 注意事项

- 确保本地环境中安装并配置了 MySQL、Redis 和 Kafka。
- 项目默认使用 UTF-8 编码，请确保系统环境支持 UTF-8。
- 若在构建过程中遇到 `Sharing is only supported for boot loader classes because bootstrap classpath has been appended`
  警告，可在 `pom.xml` 中的插件配置中添加 `-Xshare:off` 参数以禁用类数据共享。
- 配置多数据源时，请参考 `application.yml` 中的示例配置，并根据实际需求进行调整。

## 测试

项目包含基本的单元测试和集成测试。在构建项目时，Maven 会自动运行这些测试。也可以手动运行测试：

```sh
mvn test
```

## 贡献

欢迎贡献代码！请 fork 本仓库并提交 Pull Request。有关详细信息，请参阅 CONTRIBUTING.md。

## 许可证

本项目基于 MIT 许可证进行分发，详细信息请参阅 LICENSE。

* * *
感谢您使用 HyperFusion！如果有任何问题或建议，请随时联系我。