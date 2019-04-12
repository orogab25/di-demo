package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("LifeCycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleBean setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("LifeCycleBean setBeanName: "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBean afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleBean setApplicationContext");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("LifeCycleBean postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("LifeCycleBean preDestroy");
    }

    public void beforeInit(){
        System.out.println("LifeCycleBean beforeInit");
    }

    public void afterInit(){
        System.out.println("LifeCycleBean afterInit");
    }
}
