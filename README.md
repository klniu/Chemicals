# 危化品查询APP
####  开发环境
Android studio 2.3.1
#### 功能描述
1. 集成多种查询方式，查看本地数据库中危险化学品的信息；
2. 按照中文拼音和英文首字母，对化学品进行查询；
3. 按照UN号或者CAS号查询相应的化学品；
4. 按照化学品特性描述的关键词检索化学品；
5. 查看产品手册以及使用说明文档；

## 功能介绍
### 一、主界面和欢迎界面
![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302143211598-805870664.png)

程序打开时，会最先进入Welcome界面，此时程序会在后台初始化数据库，对相关工具进行初始化， 初始化结束后，会自动跳转到主界面。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302143431910-1856024260.png)

程序包含四大功能模块：
1. **名称检索** 
2. **特性检索** 
3. **编号检索** 
4. **实用手册**  
点击图标即可进入相应功能界面。                                        

### 二、名称检索

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302143641248-378660455.png)

进入名称搜索模块，在搜索框中输入化学品的中文名、中文拼音、英文名，点击查询即可检索到所对应的化学品。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302143703230-1894425677.png)

程序具备联想功能，用户可以输入部分化学品名称（包括：中文名、拼音、英文名），点击查询，程序会将数据库中跟关键字相关的化学品都检索出来，例如如果我们想查询到“乙烯”，只需要键入“乙”即可在结果中查询到“乙烯”。

### 三、编号检索（UN/CAS）

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302143729884-59991887.png)

进入编号搜索模块，系统默认展示化学品编号（UN\CAS）搜索框、搜索按钮、UN号、CAS号切换按钮。

搜索框支持UN号、CAS号输入，可通过输入框右下方单选按钮，切换UN/CAS搜索模式。

同样，程序可以自动识别不完整输入，选中切换按钮-UN号检索，此时用户输入化学品的UN号码（以乙酸为例，2789），进行部分输入，输入值“27”，结果列表自动匹配出相应的化学品。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144056465-1237453599.png)

### 四、特征检索

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144148701-81625148.png)

在特征检索模块，程序提供了强大的模糊搜索功能。

用户只需要在搜索框中输入危化品的特征，或者身处现场时对位置化学品的物理状态，化学气味等特征，键入到搜索框中，程序便会将有相关特性的化学品检索显示出来。

例如：用户可以输入“刺激性气味”这个关键词，程序会检索出所有包含刺激性气味这个属性的危化品。

### 五、实用手册

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144225650-1124556605.png)

在本模块中，程序提供了多种危化品手册，以PDF形式打包在程序中，用户点击图标即可打开相应手册，PDFView模块引用了PDF plug框架，使浏览PDF手册更加流畅，且功能强大，大大节省手机RAM空间。 

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144256377-126666033.png)

### 六、化学品详细信息
在化学品信息的详细页面下，用户可以看到基本信息、理化性质及用途、危险性、应急处置、防护建议、检测方法六个功能类别，此时可以拖动中上部的横向按钮滚动条，也可以横向滑动屏幕，达到功能切换的目的。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144329395-1600487428.png)

基本信息模块包含了化学品名称、英文名、别名、UN号、CAS号、危险货物编号、GHS分类标签的具体信息。整个页面根据化学品的信息量而定，信息量大的情况下，用户可以拖动页面向下滑动，查看全部信息。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144344459-2110017212.png)

理化性质及用途模块包含了化学品理化特性参数、用途等基本信息，整个页面根据化学品的信息量而定，信息量大的情况下，用户可以拖动页面向下滑动，查看全部信息。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144356898-1005045195.png)

危险性类别模块包括危险性类别、燃烧及爆炸危险性、健康危害等详细信息，整个页面根据化学品的信息量而定，信息量大的情况下，用户可以拖动页面向下滑动，查看全部信息。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144414862-1885670275.png)

应急处置模块包含了急救、灭火等详细信息，整个页面根据化学品的信息量而定，信息量大的情况下，用户可以拖动页面向下滑动，查看全部信息。

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302144427114-1291333072.png)

防护建议模块列出了对从业人员的防护建议。
## 数据库
### 一、SQLite数据库
APP中包含的化学品信息保存在本地数据库，在用户下载应用安装包时一并存储在移动终端的存储设备，用户可以在软件更新时查看到最新的完整版本危险化学品信息。
课题用到的Android数据库为Sqlite。Sqlite是android平台的一款轻量级的、嵌入式的、关系型数据库产品，以下是一些主要介绍：
1. Sqlite通过文件保存数据库,创建的数据库文件默认存在/data/data/<package>/databases/的文件夹下，一个文件就是一个数据库。
2. 一个数据库包含多个表格，一个表格包含不同的字段，字段类型等等，这与SQL数据库相似。
3. Sqlite记录没有顺序的概念，不存在第一第二类的概念，通过查询获取满足条件的记录。

android平台下操作数据库的相关类：
1. SQLiteOpenHelper抽象类，用于创建和管理数据库以及版本，需要创建一个子类继承，该类封装了对数据库操作的基本方法，使用方便。
2. SQLiteDatabase数据库访问了，主要是对数据库的增删改查等常用操作，功能比SQLiteOpenHelper丰富，比如事务管理，分页等等。
3. Cursor游标类，主要用来返回返回查询记录结果


### 二、数据库操作示例
数据库文件为db格式，数据库(Database)是按照数据结构来组织、存储和管理数据的仓库，这种数据集合具有如下特点：尽可能不重复，以最优方式为某个特定组织的多种应用服务，其数据结构独立于使用它的应用程序，对数据的增、删、改、查由统一软件进行管理和控制。采用navicat for SQLite软件打开

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145545085-273979666.png)

安装完成之后，进入软件，首先点击“新建连接”

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145558766-198755232.png)

在“新建连接”窗口之中输入“连接名”（可自行命名，如“test”），选择类型“现有的数据库文件”，然后在数据库文件中查找db文件的位置，选项如下图所示

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145609667-403482419.png)

然后即可在软件左侧的栏目中找到刚刚建立的连接名“test”，在“表”中找到对应的表格以及文件信息，

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145619202-1855905015.png)

数据库中收录了多达百种危险化学品。下图显示了最新录入情况，

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145632284-2146980418.png)

![](https://images2018.cnblogs.com/blog/1192699/201803/1192699-20180302145640931-1434078310.png)
