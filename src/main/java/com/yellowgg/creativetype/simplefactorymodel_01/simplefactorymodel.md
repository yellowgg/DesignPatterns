# 简单工厂模式

```java
public class FoodFactory {
    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            LanZhouNoodle noodle = new LanZhouNoodle();
            noodle.setName("好吃的兰州拉面");
            noodle.setSpicy(10);
            return noodle;
        } else if (name.equals("chicken")) {
            HuangMenChicken chicken = new HuangMenChicken();
            chicken.setName("有家黄焖鸡面");
            chicken.setCondiment("马铃薯");
            return chicken;
        } else {
            return null;
        }
    }
}
```

其中，LanZhouNoodle 和 HuangMenChicken 都继承自 Food。  
简单地说，简单工厂模式通常就是这样，一个工厂类 XxxFactory，里面有一个静态方法，根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象。  
>我们强调职责单一原则，一个类只提供一种功能，FoodFactory 的功能就是只要负责生产各种 Food。