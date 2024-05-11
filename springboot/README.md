# SpringBoot简单项目开发

实现基本的增删改查接口

![1713619459997.png](https://img2.imgtp.com/2024/04/20/aABB7doF.png)

* 有关springboot项目目录结构介绍：
  https://blog.csdn.net/qq_52870771/article/details/113191625

## 这里将会介绍如何搭建一个简单增删改查的Springboot项目

### 一、搭建数据库

首先要进行增删改查肯定是要有供操作的数据库；

这里我是用的Navicat Premium 16来搭建的，随便用什么都可以，只要能确保给项目一个配套的数据库就行；

![1713619596606.png](https://img2.imgtp.com/2024/04/20/CYUxMwkO.png)

![1713619676916.png](https://img2.imgtp.com/2024/04/20/p8FW5VgB.png)

### 二、新建一个IDEA项目

打开IDEA，新建一个spring项目

![1713619720847.png](https://img2.imgtp.com/2024/04/20/zh6j1bjt.png)

![1713619720847.png](https://img2.imgtp.com/2024/04/20/tFKnjdms.png)

检查你的pom.xml文件
![1713620019577.png](https://img2.imgtp.com/2024/04/20/9XFH4kZ0.png)
这样就创建完毕

后面打开application.properties文件连接数据库

```java
spring.application.name=SpringBoot
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/springboot
spring.datasource.username=root<--这里输入你的数据库账号
spring.datasource.password=1234<--密码
```

![1713620019577.png](https://img2.imgtp.com/2024/04/20/VbP5gQIU.png)
![1713620019578.png](https://img2.imgtp.com/2024/04/20/NqhyuRLz.png)
![1713620019578.png](https://img2.imgtp.com/2024/04/20/hAMgrfHt.png)
### 搭建四层架构：

controller，mapper，pojo，service

![1713620019578.png](https://img2.imgtp.com/2024/04/20/sTXcUz69.png)
### 三、编写代码：

经过前面的准备工作后终于可以开始写代码了；

这里我就只介绍一个接口（增加用户），其他的都是差不多的流程，**文章末尾附完整代码**；

* pojo层

![1713620019578.png](https://img2.imgtp.com/2024/04/20/D60APe7F.png)
实体类里的属性要与数据表一一对应；

* controller层

![1713620019579.png](https://img2.imgtp.com/2024/04/20/YwTBCA9J.png)
* service层

![1713620019579.png](https://img2.imgtp.com/2024/04/20/JhprC48t.png)
* 实现类

![1713620019579.png](https://img2.imgtp.com/2024/04/20/tlJ3E9MX.png)
mapper层

![1713620019579.png](https://img2.imgtp.com/2024/04/20/VHltqrVf.png)
使用注解的方式将查询的SQL语句写上，到此这个接口就算是写完了；

### 四、测试

我使用的是postmam软件进行接口的测试

测试结果：

![1713620019579.png](https://img2.imgtp.com/2024/04/20/MPnMpMNV.png)
### 五、完整代码

[Saint_xs/springboot (gitee.com)](https://gitee.com/saint_xs/springboot)

### 六、优化代码

1、完善查询功能，分页查询，条件查询......

2、对于相应的异常情况进行统一处理，发掘现有代码中可能没有考虑到的异常情况，然后修改代码解决异常。

3、进阶2：学会上线项目到服务器，部署项目（可视化控制,宝塔面板）

4、下附：阿里云学生机免费领取1+6个月（完成任务，即云服务器使用教程即可续领）的方式。
https://developer.aliyun.com/plan/student
ps：云服务器相当于一台不会关机的有公网环境的电脑，一般会配置linux版本，完成对项目的部署。云服务器作用颇多，还可以搭建个人博客，放置前端项目等用处，不会部署自己项目的程序员是不合格的。
我也不知道活动什么时候到期，早点领完促进自己学习。当然没领到的也没事，新人用户买服务器也有很多的优惠。