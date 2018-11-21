
# 这是SSM（SpringMVC，Spring，MyBaties）的整合环境


## 一、说明

这个环境拿到就能用，框架版本分别是spring-framework-5.0.2.RELEASE、mybatis-3.4.6
基本上配置文件就是这些，日志的没有输出到文件中，需要的自己修改

## 二、配置

请将你要写的类放到相应的包里面。

### 1.所有的配置文件在名为config的source folder下面，本质上部署后是在classes文件夹下。

### 2.config下的spring包放的是bean配置，(之后的已经更正)其中beans.xml是其他模块bean的综合，我在applicationContext.xml
### 中import的只有一个beans.xml。而在beans中我import了其他模块的bean配置。我们希望每一个模块有一个bean.xml
### 然后你可以自行将这个bean.xml文件import到beans.xml中。我们这样做因为spring的import不支持通配符

### 3.MyMessage.properties是hinbertnate校验器的错误信息，将其提取出来了（是的，这里加入了校验器）

### 4.applicationContext.xml和springmvc分别是Spring和springMVC的核心配置文件。当你更改了包名，记得更
### 改applicationContext.xml里的**事务配置** 

### 5.db.properties和hibernate.properties分别是c3p0数据源属性，你可以在db.properties中配置连接池
### 超时时长、最大连接数,驱动等设置（我并不推荐将连接参数意外的东西放到这里面），当然你所设置的记得**要
### 在applicationContext.xml的dataSource里进行应用** 。

### 6.log4j是没有配置输出到硬盘的，如果你不添加的话会给后期维护带来不便

### 7.sqlMapConfig.xml是MyBatis的核心配置它里面配置优化setting和定义别名


## 三、使用注意

相信使用框架的你对分层没有什么疑问
	
### 1、我使用的是注解方式开发如果你一定要xml配置的话请自行解决

### 2.当你对项目中的包、结构进行更改后记得更改相应的配置，记得mapper的java文件和xml文件要放到同一个包下

### 3.sqlSessionFactory是mybatis-spring-xxx.jar里面的bean，我们使用扫描器org.mybatis.spring.mapper.MapperScannerConfigurer扫描将mapper扫描出来

### 4.我的测试数据库是mysql，数据库是test，测试表为TestUser，你可以自己测试这个环境是否可用（访问：http://localhost:8080/baseSSM/index.jsp）

### 5.事物增强的所有service方法，如需更改请自行定义

### 6.不要带多余的环境如.classpath、.project等

### 7.已经导入了jackson的包出来json数据直接家注解就可以



------------------------------------------------------------

&copy; 李大哥 一个环境，以后如果不用maven就可以方便搭建

------------------------------------------------------------


## **更新** ：将spring的bean用通配符配置了（web.xml里），文件规范：以Bean.xml结尾且放到spring目录下

## **spring还是依赖aspectjwaver包长见识了，我一直以为它脱离了** 











