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
    alias(ihub.plugins.boot)
    alias(ihub.plugins.profiles)
}

iHubProfiles {
    tokens.set(
        mapOf(
            "profiles.active" to project.property("profiles.active").toString(),
            "logging.level" to "info",
            "revision" to project.version.toString(),
            "monitor.username" to project.property("monitor.username").toString(),
            "monitor.password" to project.property("monitor.password").toString(),
        )
    )
}

dependencies {
    // Mysql驱动包
    implementation("com.mysql:mysql-connector-j")
    implementation(project(":ruoyi-common-doc"))
    implementation(project(":ruoyi-common-social"))
    implementation(project(":ruoyi-common-ratelimiter"))
    implementation(project(":ruoyi-common-mail"))
    implementation(project(":ruoyi-system"))
    implementation(project(":ruoyi-job"))

//    implementation(libs.bundles.modules)

    implementation("de.codecentric:spring-boot-admin-starter-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
