/*
 * Copyright (c) 2024 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */
dependencies {
    api(project(":ruoyi-common-json"))
    api(project(":ruoyi-common-redis"))
    // AWS SDK for Java 2.x
    api("software.amazon.awssdk:s3") {
        // 将基于 CRT 的 HTTP 客户端从类路径中移除
        exclude("software.amazon.awssdk", "aws-crt-client")
        // 将基于 Apache 的 HTTP 客户端从类路径中移除
        exclude("software.amazon.awssdk", "apache-client")
        // 将配置基于 URL 连接的 HTTP 客户端从类路径中移除
        exclude("software.amazon.awssdk", "url-connection-client")
    }
    // 将基于 Netty 的 HTTP 客户端从类路径中移除
    api("software.amazon.awssdk:netty-nio-client")
    // 基于 AWS CRT 的 S3 客户端的性能增强的 S3 传输管理器
    api("software.amazon.awssdk:s3-transfer-manager")
}
