/*

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import shiyanlou.test.hibernate.entity.User;

public class Test {

    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();
        @SuppressWarnings("deprecation")
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // ���� StringBuilder �����Ӳ�ѯ���
        StringBuilder hq = new StringBuilder();

        // �� User ������ң�ע�� from ���пո�
        // �൱�� "select * from user_info;"
        hq.append("from ").append( User.class.getName() );

        // ���� session ���� query
        Query query = session.createQuery( hq.toString() );

        // ���л� query �Ľ��Ϊһ�� list ����
        List<User> users = query.list();

        // ��ӡÿһ�� User ��Ϣ������ֻ��ӡ�����֣���Ҳ���Դ�ӡ������Ϣ��
        for (User user : users) {
            System.out.println( user.getUsername() );

        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

*/
package shiyanlou.test.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import shiyanlou.test.hibernate.entity.User;

public class Test{
	
	public static void main(String[] args) {
		 Configuration configuration = new Configuration().configure();
		 @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		StringBuilder hq = new StringBuilder();
		hq.append("from ").append(User.class.getName());
		Query query = session.createQuery(hq.toString());
		List<User> users = query.list();
		for(User user : users){
			System.out.println(user.getUsername());
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}


