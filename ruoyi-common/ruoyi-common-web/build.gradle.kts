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
    // SpringBoot Web容器
    api("org.springframework.boot:spring-boot-starter-web") {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
    }
    // web 容器使用 undertow 性能更强
    api("org.springframework.boot:spring-boot-starter-undertow")
    api("org.springframework.boot:spring-boot-starter-actuator")
    api("cn.hutool:hutool-captcha")
    api("cn.hutool:hutool-crypto")
}
