package com.xym.spring4;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author xym
 */
@Service("aaaaaaaa")
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);

        Resource resource =
                loader.getResource("classpath:test.txt");
        try {

            System.out.println("ResourceLoader加载的文件内容为: " + IOUtils.toString(resource.getInputStream(), "UTF-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
