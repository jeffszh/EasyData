package cn.jeff.easydata.db

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ChatRecord(

		@Id
		var id: String,

		var msg: String

)
