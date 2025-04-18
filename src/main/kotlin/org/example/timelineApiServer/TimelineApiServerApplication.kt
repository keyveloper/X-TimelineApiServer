package org.example.timelineapiserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing


@SpringBootApplication
@EnableJpaAuditing
class TimelineApiServerApplication

fun main(args: Array<String>) {
    runApplication<TimelineApiServerApplication>(*args)
}
