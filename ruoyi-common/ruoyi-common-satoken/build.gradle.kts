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
    compileOnlyApi(project(":ruoyi-common-core"))
    compileOnlyApi(project(":ruoyi-common-redis"))
    // Sa-Token 权限认证, 在线文档：http://sa-token.dev33.cn/
    api("cn.dev33:sa-token-spring-boot3-starter")
    // Sa-Token 整合 jwt
    api("cn.dev33:sa-token-jwt")
    api("com.github.ben-manes.caffeine:caffeine")
}