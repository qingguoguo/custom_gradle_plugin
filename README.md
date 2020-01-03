# 自定义Gradle插件入门
* 实现接口Plugin，重写apply方法
* 在resources/META-INF/目录下新建XXX.properties文件，其中XXX就是插件id，
 apply plugin: '插件id'时使用
* build module后会在/build/libs/目录下生成XXXXXX.jar