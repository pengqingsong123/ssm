package mybatis;

import cn.ali.bean.User;
import cn.ali.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-mybatis.xml");
//        SqlSessionFactory sqlSessionFactory = ac.getBean(SqlSessionFactory.class);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = userMapper.queryUserById(1l);
        System.out.println(user);

    }
}
