package cn.jeff.easydata.ui

import cn.jeff.easydata.db.ChatRecordRepo
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("")
class MainPage(
		private val chatRecordRepo: ChatRecordRepo
) : VerticalLayout() {

	private val label01 = Label("數據")

	init {
		add("歡迎光臨！")
		add(Button("點我") {
			Notification.show("一切正常。")
		})
		add(label01)
		add(Button("試試讀取數據庫") {
			sayHi()
		})
	}

	private fun sayHi() {
		val chatRecordList = chatRecordRepo.findAll()
		label01.text = if (chatRecordList.isEmpty()) {
			"沒有數據"
		} else {
			"${chatRecordList[0]}"
		}
	}

}
