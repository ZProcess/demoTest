package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class MybatisStart {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
/*        //基于.xml文件的查询
        User user = session.selectOne("com.dao.findUser", 12);
        System.out.println(user.toString());
        //基于接口的查询
        UserDao dao = session.getMapper(UserDao.class);
        User user1 = dao.findUser(13);
        System.out.println(user1);

        System.out.println("\n");
        List<User> list = dao.findAll();
        Iterator it = list.iterator();
        for(User u:list){
            System.out.println(u.toString());
        }

       while (it.hasNext()){
            User user2 = (User) it.next();
            System.out.println(user2.toString());
        }
        System.out.println("\n");
        list.forEach((l) -> {
            System.out.println(l.toString());
        });*/

       ItemMapper itemMapper=session.getMapper(ItemMapper.class);
       List<User> l=itemMapper.findAll();
       l.forEach(li->{
           System.out.println(l.toString());
       });








    }
}
