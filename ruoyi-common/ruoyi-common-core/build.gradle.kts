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
    // Spring框架基本的核心工具
    api("org.springframework:spring-context-support")
    // SpringWeb模块
    api("org.springframework:spring-web")

    // 自定义验证注解
    api("org.springframework.boot:spring-boot-starter-validation")

    api("org.springframework.boot:spring-boot-starter-aop")

    // 常用工具类
    api("org.apache.commons:commons-lang3")

    // servlet包
    api("jakarta.servlet:jakarta.servlet-api")

    // hutool工具类
    api("cn.hutool:hutool-core")
    api("cn.hutool:hutool-http")
    api("cn.hutool:hutool-extra")

    runtimeOnly("org.springframework.boot:spring-boot-properties-migrator")

    // 离线IP地址定位库
    implementation("org.lionsoul:ip2region")
}
