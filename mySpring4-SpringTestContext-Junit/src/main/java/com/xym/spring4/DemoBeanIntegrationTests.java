package com.xym.spring4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ① SpringJUnit4ClassRunner 在Junit环境下提供Spring TestContext Framework的功能。
 * ② @ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类。
 * ③ @ActiveProfiles用来声明活动的profile
 * ④ 可使用普通的@Autowired注入Bean。
 * ⑤ 测试代码，通过JUnit的Assert来校验结果是否和预期一致。
 *
 * @author xym
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }

}
