### 概述
**外观模式**是一种结构性设计模式，能为程序库、框架或其他复杂类提供一个简单的接口

### 场景
假设我们需要在代码中使用某个复杂库或框架中的众多对象。正常情况下，你需要负责所有对象的初始化工作、管理其依赖关系并且按正确的顺序执行方法。从而导致，程序中类的业务逻辑将与第三方类的实现细节紧密耦合，使得理解和维护代码的工作很难进行。

### 解决方案
创建一个外观类，里面的方法替我们实现了各种复杂方法的执行
