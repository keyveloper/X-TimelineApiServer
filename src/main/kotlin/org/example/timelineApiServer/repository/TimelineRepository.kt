package org.example.timelineapiserver.repository

import org.example.timelineapiserver.entity.Timeline
import org.springframework.data.jpa.repository.JpaRepository

interface TimelineRepository: JpaRepository<Timeline, Long>, TimelineQueryDslRepository {
}