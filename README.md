## 笔记
#### aop拦截
##### 1、为什么要引入AOP的变成范式？
答案略
##### 2、AOP的好处以及使用场景是什么？
答案略
##### 3、AOP的两大核心要点是什么？
答案略
##### 4、Aspect的注解有哪些？
@Aspect：标注说明java类是一个aspect切面类；
@Pointcut：描述你是在哪些类的哪些方法进行切入；
Advice：你想要在这些方法的什么执行时机使用；
##### 5、切面表达式（expression）
###### Wildcards（通配符：有些方法有些类不一一列举时使用）：
“*”：匹配任意数量的字符；
“+”：匹配指定类以及其子类；
“..”：匹配任意数的子包或者参数；
###### Operators（扫描方法：组合各种要求）：
&&（与）；||（或）；!（非）

###### Designators（指示器：想通过什么方式匹配你想要的类的方法）：
execution（重点掌握，其他部分了解）

##### 6、advice注解（拦截动作）
1、@Before，前置通知：指在拦截的方法之前执行；
2、@After（finally），后置通知，在代码执行完之后执行
3、@AfterReturning，返回通知，代码成功执行之后；
4、@AfterThrowing，异常通知，代码抛出异常之后执行
5、@Around，环绕通知（既有before，return，ex也有after）

#### JDK与Cglib代理对比
1、jdk代理只能针对有接口的类的接口方法进行动态代理

2、Cglib基于继承来实现代理，无法对statistics、final类进行代理

3、Cglib基于继承来实现代理，无法对private、static方法进行代理

#### SpringAOP对两种实现的选择
1、如果目标对象实现了接口，则默认采用JDK动态代理

2、如果目标对象没有实现接口，啧采用Cglib进行动态代理

3、如果目标队形实现了接口，且强制Cglib代理，则使用Cglib代理
###### 关于强制使用Cglib代理：

@SpringBootApplication

//proxyTargetClass = true时，可看做spring强制使用Cglib代理

@EnableAspectJAutoProxy(proxyTargetClass = true)

public class AopDemoApplication(){

    .....
    
}

#### aop链式调用（看蒙了，笔记代码省略，回头再去看看）
