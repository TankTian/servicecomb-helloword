# servicecomb-helloword

运行方法：
1、获取service center版本，https://github.com/ServiceComb/service-center/releases/download/0.1.0-m1/service-center-0.1.0-m1-windows-amd64.zip
解压直接运行： ./start.bat
2、导入工程到本地eclipse
3、运行servicecomb-helloword/servicecomb-helloword-provider/src/main/java/io/servicecomb/demo/HelloProviderMain.java 发布服务
4、运行servicecomb-helloword/servicecomb-helloword-consumer/src/main/java/io/servicecomb/demo/HelloConsumerMain.java 消费服务
5、如果消费端打印日志： ServiceComb test success即表示验证成功。
