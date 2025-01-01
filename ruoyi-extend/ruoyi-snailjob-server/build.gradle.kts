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
            "monitor.username" to project.property("monitor.username").toString(),
            "monitor.password" to project.property("monitor.password").toString(),
        )
    )
}

dependencies {
    implementation("com.aizuda:snail-job-server-starter")
    implementation("de.codecentric:spring-boot-admin-starter-client")
}
