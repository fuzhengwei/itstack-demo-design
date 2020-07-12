# 重学 Java 设计模式

> **作者：** 小傅哥，Java Developer，[:pencil2: 虫洞 · 科技栈，作者](https://bugstack.cn)，[:trophy: CSDN 博客专家](https://bugstack.blog.csdn.net)

> 本代码库是作者小傅哥多年从事一线互联网```Java```开发的学习历程技术汇总，旨在为大家提供一个清晰详细的学习教程，侧重点更倾向编写Java核心内容。如果本仓库能为您提供帮助，请给予支持(关注、点赞、分享)！

<br/>
<div align="center">
    <a href="https://bugstack.cn" style="text-decoration:none"><img src="https://bugstack.cn/assets/images/icon.svg" width="128px"></a>
</div>
<br/>  

<div align="center">
<a href="https://github.com/fuzhengwei/CodeGuide"><img src="https://badgen.net/github/stars/fuzhengwei/CodeGuide?icon=github&color=4ab8a1"></a>
<a href="https://github.com/fuzhengwei/CodeGuide"><img src="https://badgen.net/github/forks/fuzhengwei/CodeGuide?icon=github&color=4ab8a1"></a>
<a href="https://bugstack.cn" target="_blank"><img src="https://bugstack.cn/assets/images/onlinebook.svg"></a>
<a href="https://bugstack.cn/assets/images/qrcode.png?x-oss-process=style/may"><img src="https://itstack.org/_media/wxbugstack.svg"></a>
</div>
<br/>

**Hello, world of design！** 你好，设计模式的世界！

欢迎来到这里，很高兴你能拿到这本书，如果你能坚持看完并按照书中的例子进行实践，那么在编程开发的世界里，就又多了一个可以写出良好代码的人，同时也为架构师培养储备了一个人才。

可能在此之前你也多少了解过设计模式，但在实际的业务开发中使用却不多，多数时候都是大面积堆积`ifelse`组装业务流程，对于一次次的需求迭代和逻辑补充，只能东拼西凑`Ctrl+C`、`Ctrl+V`。

所以为了能让更多的程序员👨‍💻‍更好的接受设计思想和架构思维，并能运用到实际的业务场景。本书的作者`小傅哥`，投入50天时间，从互联网实际业务开发中抽离出，交易、营销、秒杀、中间件、源码等22个真实场景，来学习设计模式实践使用的应用可上手技能。

**谁发明了设计模式？**

设计模式的概念最早是由 `克里斯托佛·亚历山大` 在其著作 `《建筑模式语言》` 中首次提出的。 本书介绍了城市设计的 “语言”，提供了253个描述城镇、邻里、住宅、花园、房间及西部构造的模式， 而此类 “语言” 的基本单元就是模式。后来，`埃里希·伽玛`、 `约翰·弗利赛德斯`、 `拉尔夫·约翰逊` 和 `理查德·赫尔姆` 这四位作者接受了模式的概念。 1994 年， 他们出版了 `《设计模式： 可复用面向对象软件的基础》` 一书， 将设计模式的概念应用到程序开发领域中。 

其实有一部分人并没有仔细阅读过设计模式的相关书籍和资料，但依旧可以编写出优秀的代码。这主要是由于在经过众多项目的锤炼和对程序设计的不断追求，从而在多年编程历程上提炼出来的心得体会。而这份经验最终会与设计模式提到的内容几乎一致，同样会要求高内聚、低耦合、可扩展、可复用。你可能也遇到类似的经历，在学习一些框架的源码时，发现它里的某些设计和你在做开发时一样。

**我怎么学不会设计模式？**

钱也花了，书也买了。代码还是一坨一坨的！设计模式是由多年的经验提炼出来开发指导思想。就像我告诉你自行车怎么骑、汽车怎么开，但只要你没跑过几千公里，你能记住的只是理论，想上道依旧很慌！

**所以**，本设计模式专题系列开始，会带着你使用设计模式的思想去优化代码。从而学习设计模式的心得并融入给自己。当然这里还需要多加练习，一定是*人车合一*，才能站在设计模式的基础上构建出更加合理的代码。

**阅读建议**

本书属于实战型而不是理论介绍类书籍，每一章节都有对应的完整代码，学习的过程需要参考书中的章节与代码一起学习，同时在学习的过程中需要了解并运行代码。学习完成后进行知识点的总结，以及思考🤔这样的设计模式在自己的业务场景中需要如何使用。

## 创建型模式

- [`1. 重学 Java 设计模式：实战工厂方法模式「多种类型商品不同接口，统一发奖服务搭建场景」`](https://bugstack.cn/itstack-demo-design/2020/05/20/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.html)
- [`2. 重学 Java 设计模式：实战抽象工厂模式「替换Redis双集群升级，代理类抽象场景」`](https://bugstack.cn/itstack-demo-design/2020/05/24/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.html)
- [`3. 重学 Java 设计模式：实战建造者模式「各项装修物料组合套餐选配场景」`](https://bugstack.cn/itstack-demo-design/2020/05/26/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.html)
- [`4. 重学 Java 设计模式：实战原型模式「上机考试多套试，每人题目和答案乱序排列场景」`](https://bugstack.cn/itstack-demo-design/2020/05/28/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F.html)
- [`5. 重学 Java 设计模式：实战单例模式「7种单例模式案例，Effective Java 作者推荐枚举单例模式」`](https://bugstack.cn/itstack-demo-design/2020/05/31/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.html)

## 结构型模式

- [`1. 重学 Java 设计模式：实战适配器模式「从多个MQ消息体中，抽取指定字段值场景」)`](https://bugstack.cn/itstack-demo-design/2020/06/02/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
- [`2. 重学 Java 设计模式：实战桥接模式「多支付渠道(微信、支付宝)与多支付模式(刷脸、指纹)场景」`](https://bugstack.cn/itstack-demo-design/2020/06/04/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F.html)
- [`3. 重学 Java 设计模式：实战组合模式「营销差异化人群发券，决策树引擎搭建场景」`](https://bugstack.cn/itstack-demo-design/2020/06/08/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.html)
- [`4. 重学 Java 设计模式：实战装饰器模式「SSO单点登录功能扩展，增加拦截用户访问方法范围场景」`](https://bugstack.cn/itstack-demo-design/2020/06/09/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
- [`5. 重学 Java 设计模式：实战外观模式「基于SpringBoot开发门面模式中间件，统一控制接口白名单场景」`](https://bugstack.cn/itstack-demo-design/2020/06/11/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F.html)
- [`6. 重学 Java 设计模式：实战享元模式「基于Redis秒杀，提供活动与库存信息查询场景」`](https://bugstack.cn/itstack-demo-design/2020/06/14/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F.html)
- [`7. 重学 Java 设计模式：实战代理模式「模拟mybatis-spring中定义DAO接口，使用代理类方式操作数据库原理实现场景」`](https://bugstack.cn/itstack-demo-design/2020/06/16/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F.html)

## 行为模式

- [`1. 重学 Java 设计模式：实战责任链模式「模拟618电商大促期间，项目上线流程多级负责人审批场景」`](https://bugstack.cn/itstack-demo-design/2020/06/18/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F.html)
- [`2. 重学 Java 设计模式：实战命令模式「模拟高档餐厅八大菜系，小二点单厨师烹饪场景」`](https://bugstack.cn/itstack-demo-design/2020/06/21/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.html)
- [`3. 重学 Java 设计模式：实战迭代器模式「模拟公司组织架构树结构关系，深度迭代遍历人员信息输出场景」`](https://bugstack.cn/itstack-demo-design/2020/06/23/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
- [`4. 重学 Java 设计模式：实战中介者模式「按照Mybaits原理手写ORM框架，给JDBC方式操作数据库增加中介者场景」`](https://bugstack.cn/itstack-demo-design/2020/06/27/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F.html)
- [`5. 重学 Java 设计模式：实战备忘录模式「模拟互联网系统上线过程中，配置文件回滚场景」`](https://bugstack.cn/itstack-demo-design/2020/06/28/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F.html)
- [`6. 重学 Java 设计模式：实战观察者模式「模拟类似小客车指标摇号过程，监听消息通知用户中签场景」`](https://bugstack.cn/itstack-demo-design/2020/06/30/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.html)
- [`7. 重学 Java 设计模式：实战状态模式「模拟系统营销活动，状态流程审核发布上线场景」`](https://bugstack.cn/itstack-demo-design/2020/07/02/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.html)
- [`8. 重学 Java 设计模式：实战策略模式「模拟多种营销类型优惠券，折扣金额计算策略场景」`](https://bugstack.cn/itstack-demo-design/2020/07/05/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F.html)
- [`9. 重学 Java 设计模式：实战模版模式「模拟爬虫各类电商商品，生成营销推广海报场景」`](https://bugstack.cn/itstack-demo-design/2020/07/07/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E6%A8%A1%E6%9D%BF%E6%A8%A1%E5%BC%8F.html)
- [`10. 重学 Java 设计模式：实战访问者模式「模拟家长与校长，对学生和老师的不同视角信息的访问场景」`](https://bugstack.cn/itstack-demo-design/2020/07/09/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F.html)

---

*截止到此设计模式内容就全部讲完了，可能书中会因作者水平有限，有一些描述不准确或者错字内容。欢迎提交给我，也欢迎和我讨论相关的技术内容，作者小傅哥，非常愿意与同好进行交流，互相提升技术。*
