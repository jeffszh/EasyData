# 簡易數據
這是一個最簡單的使用H2數據庫的例子，作為自己日後寫數據庫應用的參考。
發現在application.properties中寫入了：
spring.datasource.url=jdbc:h2:e:/h2db/myTest
就會自動創建數據庫文件，那就使用 H2 最新版吧，
pom.xml中不指定版本就是最新版了，目前是 1.4.200 。

另外，application.properties中還是要指定
spring.jpa.hibernate.ddl-auto=update 或 none
不指定會是create，會每次都清空數據。
