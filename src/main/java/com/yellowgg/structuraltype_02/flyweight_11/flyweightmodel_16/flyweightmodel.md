# 享元模式

在面向对象程序设计过程中，有时会面临要创建大量相同或相似对象实例的问题。创建那么多的对象将会耗费很多的系统资源， 它是系统性能提高的一个瓶颈。例如，围棋和五子棋中的黑白棋子，图像中的坐标点或颜色，局域网中的路由器、交换机和集线器，
教室里的桌子和凳子等。这些对象有很多相似的地方，如果能把它们相同的部分提取出来共享，则能节省大量的系统资源，这就是享元模式的产生背景。

## 定义与特点

- 定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、 避免大量相似类的开销，从而提高系统资源的利用率。

- 优点：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
- 缺点：
    1. 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
    2. 读取享元模式的外部状态会使得运行时间稍微变长。

## 结构与实现

享元模式中存在以下两种状态：

1. 内部状态，即不会随着环境的改变而改变的可共享部分；
2. 外部状态，指随环境改变而改变的不可以共享的部分。享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。

### 结构

- 抽象享元角色（Flyweight）: 是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
- 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
- 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
- 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。

![img.png](img.png)

**UnsharedConcreteFlyweight** 是非享元角色，里面包含了非共享的外部状态信息 info；  
**Flyweight** 是抽象享元角色，里面包含了享元方法 operation(UnsharedConcreteFlyweight state)，非享元的外部状态以参数的形式通过该方法传入；  
**ConcreteFlyweight** 是具体享元角色，包含了关键字 key，它实现了抽象享元接口；  
**FlyweightFactory** 是享元工厂角色，它是关键字 key 来管理具体享元； 客户角色通过享元工厂获取具体享元，并访问具体享元的相关方法。

### 实现

```
public class FlyweightPattern
{
    public static void main(String[] args)
    {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");       
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));       
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));       
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));       
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));       
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }
}
//非享元角色
class UnsharedConcreteFlyweight
{
    private String info;
    UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
//抽象享元角色
interface Flyweight
{
    public void operation(UnsharedConcreteFlyweight state);
}
//具体享元角色
class ConcreteFlyweight implements Flyweight
{
    private String key;
    ConcreteFlyweight(String key)
    {
        this.key=key;
        System.out.println("具体享元"+key+"被创建！");
    }
    public void operation(UnsharedConcreteFlyweight outState)
    {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}
//享元工厂角色
class FlyweightFactory
{
    private HashMap<String, Flyweight> flyweights=new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key)
    {
        Flyweight flyweight=(Flyweight)flyweights.get(key);
        if(flyweight!=null)
        {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        }
        else
        {
            flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
```

> 在代码文件中通过五子棋的例子来加深理解。  
> 棋子（ChessPieces）类是抽象享元角色，它包含了一个落子的 downPieces(Graphics g,Point pt) 方法；  
> 白子（WhitePieces）和黑子（BlackPieces）类是具体享元角色，它实现了落子方法；  
> Point 是非享元角色，它指定了落子的位置；  
> WeiqiFactory 是享元工厂角色，它通过 ArrayList来管理棋子，并且提供了获取白子或者黑子的 getChessPieces(String type) 方法；  
> 客户类（Chessboard）利用 Graphics 组件在框架窗体中绘制一个棋盘，并实现 mouseClicked(MouseEvent e) 事件处理方法，
> 该方法根据用户的选择从享元工厂中获取白子或者黑子并落在棋盘上。

### 应用场景

前面分析了享元模式的结构与特点，下面分析它适用的应用场景。享元模式是通过减少内存中对象的数量来节省内存空间的，所以以下几种情形适合采用享元模式。

1. 系统中存在大量相同或相似的对象，这些对象耗费大量的内存资源。
2. 大部分的对象可以按照内部状态进行分组，且可将不同部分外部化，这样每一个组只需保存一个内部状态。
3. 由于享元模式需要额外维护一个保存享元的数据结构，所以应当在有足够多的享元实例时才值得使用享元模式。

### 扩展

在前面介绍的享元模式中，其结构图通常包含可以共享的部分和不可以共享的部分。在实际使用过程中，有时候会稍加改变， 即存在两种特殊的享元模式：单纯享元模式和复合享元模式，下面分别对它们进行简单介绍。

(1) 单纯享元模式，这种享元模式中的所有的具体享元类都是可以共享的，不存在非共享的具体享元类。
![img_1.png](img_1.png)

(2) 复合享元模式，这种享元模式中的有些享元对象是由一些单纯享元对象组合而成的，它们就是复合享元对象。虽然复合享元对象本身不能共享，但它们可以分解成单纯享元对象再被共享。
![img_2.png](img_2.png)


