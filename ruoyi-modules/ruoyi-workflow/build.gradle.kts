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
    // 引入flowable依赖
    api("org.flowable:flowable-spring-boot-autoconfigure") {
        exclude(group = "org.flowable", module = "flowable-spring-security")
    }
    api("org.flowable:flowable-spring-configurator")
    api("org.flowable:flowable-spring-boot-starter-actuator")
    // 绘制flowable流程图
    api("org.flowable:flowable-image-generator")
    // flowable json 转换
    api("org.flowable:flowable-json-converter")
    // svg转png图片工具
    api("org.apache.xmlgraphics:batik-all") {
        exclude(group = "xalan", module = "xalan")
    }

    api(project(":ruoyi-common-websocket"))
    api(project(":ruoyi-common-mail"))
    api(project(":ruoyi-common-sms"))
    api(project(":ruoyi-common-mybatis"))
    api(project(":ruoyi-common-web"))
    api(project(":ruoyi-common-log"))
    api(project(":ruoyi-common-idempotent"))
    api(project(":ruoyi-common-excel"))
    api(project(":ruoyi-common-translation"))
    api(project(":ruoyi-common-tenant"))
    api(project(":ruoyi-common-security"))
}
