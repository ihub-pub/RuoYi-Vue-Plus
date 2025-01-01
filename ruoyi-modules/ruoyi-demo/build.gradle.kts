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
plugins {
    alias(ihub.plugins.publish)
}

dependencies {
    api(project(":ruoyi-common-core"))
    api(project(":ruoyi-common-doc"))
    api(project(":ruoyi-common-sms"))
    api(project(":ruoyi-common-mail"))
    api(project(":ruoyi-common-redis"))
    api(project(":ruoyi-common-idempotent"))
    api(project(":ruoyi-common-mybatis"))
    api(project(":ruoyi-common-log"))
    api(project(":ruoyi-common-excel"))
    api(project(":ruoyi-common-security"))
    api(project(":ruoyi-common-web"))
    api(project(":ruoyi-common-ratelimiter"))
    api(project(":ruoyi-common-translation"))
    api(project(":ruoyi-common-sensitive"))
    api(project(":ruoyi-common-encrypt"))
    api(project(":ruoyi-common-tenant"))
    api(project(":ruoyi-common-websocket"))
}
