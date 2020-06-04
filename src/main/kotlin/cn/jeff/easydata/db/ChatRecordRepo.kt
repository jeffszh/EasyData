package cn.jeff.easydata.db

import org.springframework.data.jpa.repository.JpaRepository

interface ChatRecordRepo : JpaRepository<ChatRecord, String>
