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
    api("org.redisson:redisson-spring-boot-starter")
    api("com.baomidou:lock4j-redisson-spring-boot-starter")
    api("com.github.ben-manes.caffeine:caffeine")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
}
