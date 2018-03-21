package com.xym.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 在Spring4.x常用配置(四):Spring Profile中知道，通过活动的profile可以获得不同的Bean。Spring4提供了一个更加通用的基于条件的Bean的创建，即使用@Conditional注解。
 *
 * @author xym
 * @Conditional根据满足某一个特定条件创建一个特定的Bean。比如说，当某一个jar包在某一个类路径下的时候，自动配置一个或者多个Bean；或者只有某个Bean被创建才会创建另外一个Bean。总的来说，就是根据特定条件来控制Bean的创建行为，这样我们可以利用这个特性进行一些自动的配置。 在Spring Boot中大量的应用到条件注解，后面有机会我们会说到。
 * <p>
 * 下面的示例将以不同的操作系统为条件，将通过实现Condition接口，并重写其matches方法来构造判断条件。若在Windows系统下运行程序，则输出列表命令 为dir；若在Linux操作系统下运行程序，则输出列表命令为ls。
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConifg.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为: " + listService.showListCmd());

        context.close();
    }
}
