# LearningDesignPattern
Learning design pattern

1,策略模式(Strategy)：
    定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

2,装饰者模式（Decorator）：
    动态的将责任附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择。

3，适配器模式（Adapter）:
    将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。

4,抽象工厂(abstract factory)
    提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

5,工厂方法模式（Simple factory）
    定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类吧实例化推迟到子类。

6,单件模式 （Singleton)
    确保一个类只有一个实例，并提供一个全局访问点。

7,命令模式 (Command)
    将"请求"封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销的操作.

8, 适配器模式(Adapter)
    将一个类的接口，转换成客户期望的另一个接口。适配器让原来接口不兼容的类可以合作无间.

9, 外观模式(Facade)
    提供了一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用。

10, 模板方法模式（）
    在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
    
设计原则：
1，要依赖抽象，不要依赖具体类。
2, 多用组合，少用继承。
3, 针对接口编程，不针对实现编程.
4, 为交互对象之间的松耦合设计而努力。
5，类应该对扩展开放，对修改关闭。
6，
7，好莱坞原则：别调用我们，我们会调用你。
