package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean set");
    }

    public void onInit(){
        System.out.println("Init");
    }

    public void onDestroy(){
        System.out.println("Destroy");
    }
}
