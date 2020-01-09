# 自定义Gradle插件入门
* 实现接口Plugin，重写apply方法
* 在resources/META-INF/目录下新建XXX.properties文件，其中XXX就是插件id，
 apply plugin: '插件id'时使用
* build module后会在/build/libs/目录下生成XXXXXX.jar

# Gradle构建过程
* 初始化阶段

    读取根目录中的setting.gradle中的include信息，确定有多少module加入
    构建并创建Project实例，每个build.gradle对应一个Project实例
* 配置阶段

    根据module下面的build.gradle，配置gradle对象，并构建好任务依赖顺序图
* 执行阶段

    根据配置阶段获取到的配置信息和任务依赖顺序图执行对应的task

一个Project有若干的task，而一个task有若干的action
