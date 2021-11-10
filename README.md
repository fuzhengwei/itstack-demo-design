# 重学 Java 设计模式

> **作者：** 小傅哥，Java Developer，[:pencil2: 虫洞 · 科技栈，作者](https://bugstack.cn)，[:trophy: CSDN 博客专家](https://bugstack.blog.csdn.net)

> 本代码库是作者小傅哥多年从事一线互联网```Java```开发的学习历程技术汇总，旨在为大家提供一个清晰详细的学习教程，侧重点更倾向编写Java核心内容。如果本仓库能为您提供帮助，请给予支持(关注、点赞、分享)！

<br/>
<div align="center">
    <a href="https://bugstack.cn" style="text-decoration:none"><img src="https://bugstack.cn/images/system/CodeGuide-LOGO.png?raw=true" width="256px"></a>
</div>
<br/>

<div align="center">
	<a href="https://bugstack.cn/md/other/guide-to-reading.html"><img src="https://bugstack.cn/images/system/CodeGuide-Read.svg"></a>
	<a href="https://bugstack.cn/images/personal/qrcode.png"><img src="https://bugstack.cn/images/system/CodeGuide-WeiXinCode.svg"></a>
	<a href="https://bugstack.cn/md/knowledge/pdf/2021-01-26-Java%E9%9D%A2%E7%BB%8F%E6%89%8B%E5%86%8CPDF%E4%B8%8B%E8%BD%BD.html"><img src="https://bugstack.cn/images/system/CodeGuide-JavaPDF.svg"></a>
	<a href="https://mp.weixin.qq.com/s/VthCUlT8oAJqKOoq5_NzSQ"><img src="https://bugstack.cn/images/system/CodeGuide-Lottery.svg"></a>
	<a href="https://github.com/fuzhengwei/CodeGuide"><img src="https://badgen.net/github/stars/fuzhengwei/CodeGuide?icon=github&color=4ab8a1"></a>
</div>

<br/>
<div align="center">
    <a href="https://bugstack.cn" style="text-decoration:none"><img src="https://github.com/fuzhengwei/itstack-demo-design/blob/master/pdf.png?raw=true" width="500"></a>
</div>
<br/>  

## ⛳ 目录

- [书籍下载&购买](https://github.com/fuzhengwei/itstack-demo-design#%E4%B9%A6%E7%B1%8D%E4%B8%8B%E8%BD%BD%E8%B4%AD%E4%B9%B0)
- [源码下载](https://github.com/fuzhengwei/itstack-demo-design#%E6%BA%90%E7%A0%81%E4%B8%8B%E8%BD%BD) - [GitHub](https://github.com/fuzhengwei/itstack-demo-design)、[Gitee](https://gitee.com/fustack/itstack-demo-design)
- [内容简介](https://github.com/fuzhengwei/itstack-demo-design#%E5%86%85%E5%AE%B9%E7%AE%80%E4%BB%8B)
- [电子版书籍](https://github.com/fuzhengwei/itstack-demo-design#%E7%94%B5%E5%AD%90%E7%89%88%E6%97%A7%E7%89%88---%E5%9C%A8%E7%BA%BF%E9%98%85%E8%AF%BB)
- [参与贡献](https://github.com/fuzhengwei/itstack-demo-design#%E5%8F%82%E4%B8%8E%E8%B4%A1%E7%8C%AE)
- [与我联系](https://github.com/fuzhengwei/itstack-demo-design#%E4%B8%8E%E6%88%91%E8%81%94%E7%B3%BB)
- [致谢](https://github.com/fuzhengwei/itstack-demo-design#%E8%87%B4%E8%B0%A2)
- [Go -> 小傅哥的更多原创内容 面经手册、手撸Spring、字节码编程、DDD实战项目、SpringBoot中间件等](https://github.com/fuzhengwei/CodeGuide)

## 书籍下载&购买

#### - 小傅哥的《重学 Java 设计模式》 ⭐⭐⭐⭐

>本书是作者`小傅哥`，投入50天时间，从互联网实际业务开发中抽离出，交易、营销、秒杀、中间件、源码等22个真实业务场景，编写了18万字271页的实战型Java编程资料。如果书中含有不易理解的内容，一定是作者在编写的过程中缺少必要的描述和严格的校准，感谢把你的意见或者疑问提交给我，也欢迎与我多一些交互，互相进步共同成长。

- 旧版电子书：关注公众号：[bugstack虫洞栈 `点击扫码`](https://bugstack.cn/assets/images/qrcode.png)，回复：`设计模式`
- 新版纸质书：[https://item.jd.com/13218336.html](https://item.jd.com/13218336.html) `内容补充、添加类图、重画图稿、全书彩印`，一本可以在手边随时翻阅的设计模式，感谢支持。


## 源码下载

- **GitHub** [https://github.com/fuzhengwei/itstack-demo-design | `小傅哥 Java 原创版本`](https://github.com/fuzhengwei/itstack-demo-design)
- **Gitee** [https://gitee.com/fustack/itstack-demo-design | `小傅哥 Java 原创版本`](https://gitee.com/fustack/itstack-demo-design)

*欢迎更多小伙伴，贡献关于此设计模式其他版语言，我会帮你添加链接*

## 内容简介

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

## 电子版(旧版) - 👉[**在线阅读**](https://bugstack.cn/md/develop/design-pattern/2020-05-20-%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F%E3%80%8B.html)

- 创建型模式

    - [重学 Java 设计模式《实战工厂方法模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-05-20-%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《抽象工厂模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-05-24-%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战建造者模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-05-26-%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战原型模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-05-28-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战单例模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-05-31-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F%E3%80%8B.md)    

- 结构型模式

    - [重学 Java 设计模式《适配器模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-02-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战桥接模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-04-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战组合模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-08-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战装饰器模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-09-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战外观模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-11-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战享元模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-14-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战代理模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-16-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F%E3%80%8B.md)

- 行为型模式

    - [重学 Java 设计模式《实战责任链模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-18-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战命令模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-21-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战迭代器模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-23-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战中介者模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-27-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战备忘录模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-28-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战观察者模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-06-30-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战状态模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-07-02-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战策略模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-07-05-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战模板模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-07-07-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E6%A8%A1%E6%9D%BF%E6%A8%A1%E5%BC%8F%E3%80%8B.md)
    - [重学 Java 设计模式《实战访问者模式》](https://github.com/fuzhengwei/CodeGuide/blob/master/docs/md/develop/design-pattern/2020-07-09-%E9%87%8D%E5%AD%A6%20Java%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E3%80%8A%E5%AE%9E%E6%88%98%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F%E3%80%8B.md)

---

## 参与贡献

1. 如果您对本项目有任何建议或发现文中内容有误的，欢迎提交 issues 进行指正。
2. 对于文中我没有涉及到知识点，欢迎提交 PR。

## 与我联系

- **加群交流** 本群的宗旨是给大家提供一个良好的技术学习交流平台，所以杜绝一切广告！由于微信群人满 100 之后无法加入，请扫描下方二维码先添加作者 “小傅哥” 微信(fustack)，备注：加群。

<img src="https://bugstack.cn/images/personal/fustack.png" width="180px">

- **公众号(bugstack虫洞栈)** - 沉淀、分享、成长，专注于原创专题案例，以最易学习编程的方式分享知识，让自己和他人都能有所收获。

<img src="https://bugstack.cn/images/personal/qrcode.png" width="180px">

## 致谢

感谢以下人员对本仓库做出的贡献或者对小傅哥的赞赏，当然不仅仅只有这些贡献者，这里就不一一列举了。如果你希望被添加到这个名单中，并且提交过 Issue 或者 PR，请与我联系。

**:seedling: 感谢大家对仓库建设的贡献**

<a href="https://github.com/6freeair2016">
    <img src="https://avatars.githubusercontent.com/u/20253565?v=4" style="border-radius:5px" width="50px">
</a> 
<a href="https://github.com/LittleBrotherFu">
    <img src="https://avatars.githubusercontent.com/u/25544835?v=4" style="border-radius:5px" width="50px">
</a> 
<a href="https://github.com/MichaelHan0228">
    <img src="https://avatars.githubusercontent.com/u/33157567?v=4" style="border-radius:5px" width="50px">
</a>


*截止到此设计模式内容就全部讲完了，可能书中会因作者水平有限，有一些描述不准确或者错字内容。欢迎提交给我，也欢迎和我讨论相关的技术内容，作者小傅哥，非常愿意与同好进行交流，互相提升技术。*
