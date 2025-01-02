/*
 * Copyright (c) 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    alias(ihub.plugins.root)
    alias(ihub.plugins.profiles) apply false
    alias(ihub.plugins.java) apply false
    alias(ihub.plugins.publish) apply false
    alias(ihub.plugins.boot) apply false
}

subprojects {
    !project.pluginManager.hasPlugin("java-platform") || return@subprojects
    apply {
        plugin("pub.ihub.plugin.ihub-java")
        if (project.name.startsWith("ruoyi-common")) {
            plugin("pub.ihub.plugin.ihub-publish")
        }
    }

    tasks.withType(JavaCompile::class) {
        options.compilerArgs.add("-parameters")
    }
}

subprojects {
    afterEvaluate {
        if (project.pluginManager.hasPlugin("maven-publish")) {
            tasks.withType<Javadoc> {
                options {
                    this as StandardJavadocDocletOptions
                    addBooleanOption("Xdoclint:none", true)
                    addStringOption("Xmaxwarns", "1")
                }
            }
            configure<PublishingExtension> {
                publications.withType {
                    if (this is MavenPublication) {
                        pom {
                            name = project.name
                            description = "RuoYi Common Libs"
                            url = "https://github.com/dromara/RuoYi-Vue-Plus"
                            licenses {
                                license {
                                    name = "MIT License"
                                    url = "https://opensource.org/licenses/MIT"
                                }
                            }
                            developers {
                                developer {
                                    id = "JavaLionLi"
                                    name = "CrazyLionLi"
                                    url = "https://github.com/JavaLionLi"
                                }
                            }
                            scm {
                                url = "https://github.com/dromara/RuoYi-Vue-Plus"
                                connection = "scm:git:git://github.com/dromara/RuoYi-Vue-Plus.git"
                                developerConnection = "scm:git:ssh://github.com/dromara/RuoYi-Vue-Plus.git"
                            }
                        }
                    }
                }
            }
        } else {
            tasks.withType<Javadoc> {
                enabled = false
            }
        }
    }
}
