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
    api(project(":ruoyi-common-core"))
    api(project(":ruoyi-common-doc"))
    api(project(":ruoyi-common-mybatis"))
    api(project(":ruoyi-common-web"))
    api(project(":ruoyi-common-log"))
    // velocity代码生成使用模板
    api("org.apache.velocity:velocity-engine-core")
    api("org.anyline:anyline-environment-spring-data-jdbc")
    api("org.anyline:anyline-data-jdbc-mysql")
}
