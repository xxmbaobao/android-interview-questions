=========core Android=========
1 Describe MVP
MVP架构背后的核心思想就是将Activity/Fragment变成一个单纯的View，负责展示数据并将各种事件分发给中间人，也就是Presenter。
Presenter会处理每一个事件，从Model层获取或上传数据，并将获得的数据进行处理并让View层展示。
Presenter与View（这里是Activity/Fragment）的通信，是通过Activity/Fragment所继承的View接口来间接完成的。
这样数据展示过程的任务就分开了，并使测试更加方便，因为Presenter不包含任何依赖Android的代码。
延伸:如何保证MVP不会出现内存泄露（也即是P和View 的生命周期保持一致）
->通过Loader

2 Explain activity lifecycle.
  http://blog.sina.com.cn/s/blog_5ffeae360100ekoo.html
  网址链接中的实验6，谁在栈顶才会执行onrestart | 执行了ondestroy的 Activity 是不会重新走restart的 实验7中的如屏幕旋转
  
3 tell all android application 组建
    http://blog.csdn.net/zongzhankui/article/details/44002489
    IntentFilter详细说明:http://blog.csdn.net/cnnumen/article/details/8464786
    
    显式Intent：显式Intent明确指定需要启动或者触发的组件的名称。
    隐式Intent：隐式Intent只是指定需要启动或者触发的组件应满足怎样的条件。
    对于显式Intent而言，Android系统无须对该Intent做任何解析，系统直接找到指定的目标组件，启动或触发它即可。
    对于隐式Intent而言，Android系统需要对该Intent进行解析，解析出它的条件，然后再去系统中查找与之匹配的目标条件。如果找到符合条件的组件，就启动或触发它们。
    那么Android系统如何判断被调用组件是否符合隐式Intent呢？这就需要靠IntentFilter来实现了，被调用组件可通过IntentFilter来声明自己所满足的条件——也就是声明自己到底能处理哪些隐式Intent。
4 Service vs IntentService
 IntentService 里面有个HandlerThead,所有任务都是通过这个工作线程处理的用户可以实现onHandleIntent添加任务,处理完成后会stopSelf(id) (启动service的次数和最后和这个id相等时才会停止服务,也就是多次启动这个service处理完成任务后才关闭;这个多次启动指的是先前的任务没有处理完)
 可以参考:https://stackoverflow.com/questions/15524280/service-vs-intentservice/15772151#15772151   回答问题显得有条理性.   


  5How to persist data in an Android app?
  文件 ,数据库,sharepreference,网络,contentprovider(对外统一接口,实际上保存可能是文件,数据库等)
 
