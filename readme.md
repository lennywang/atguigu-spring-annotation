1、来自尚硅谷spring

#note

### 1、Spring 生命周期

```

@Component
public class Cat  implements InitializingBean,DisposableBean {

    public Cat() {
        System.out.println("Cat...constructor...");
    }

    public void destroy() throws Exception {
        System.out.println("Cat...destroy...");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Cat...PostConstruct...");
    }

    @PreDestroy
    public void destory()
    {
        System.out.println("Cat...PreDestroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat...afterPropertiesSet...");
    }
    }
```

打印结果
```
Cat...constructor...  
Cat...PostConstruct...  
Cat...afterPropertiesSet....  
Cat...PreDestroy...  
Cat...destroy...  
```
### 2、组件赋值
1）、默认优先按照类型去容器中找对应的组件:applicationContext.getBean(BookDao.class);找到就赋值  
2）、如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找 applicationContext.getBean("bookDao")  
3）、@Qualifier("bookDao")：使用@Qualifier指定需要装配的组件的id，而不是使用属性名  
4）、自动装配默认一定要将属性赋值好，没有就会报错；可以使用@Autowired(required=false);  
5）、@Primary：让Spring进行自动装配的时候，默认使用首选的bean；也可以继续使用@Qualifier指定需要装配的bean的名字