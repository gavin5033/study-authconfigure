import java.util.Map;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.alibaba.fastjson.JSON;
import com.ql.servicetest.conditionDemo.Person;

/**
 * @ClassName ConditionTest @Description ConditionTest @Author stack @Version 1.0
 *
 * @since 2019/6/27 17:35
 */
public class ConditionTest extends BaseTest implements ApplicationContextAware {

  public ApplicationContext ApplicationContext;

  @Test
  public void test1() {
    Map<String, Person> beansOfType = ApplicationContext.getBeansOfType(Person.class);

    String property = ApplicationContext.getEnvironment().getProperty("os.name");
    System.out.println("当前系统为:" + property);

    System.out.println(JSON.toJSONString(beansOfType));
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.ApplicationContext = applicationContext;
  }
}
