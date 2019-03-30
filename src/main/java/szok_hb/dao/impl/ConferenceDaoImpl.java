package szok_hb.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import szok_hb.dao.ConferenceDao;
import szok_hb.tables.Conference;

import java.util.List;

public class ConferenceDaoImpl implements ConferenceDao {

    private final SessionFactory sessionFactory;

    public ConferenceDaoImpl (SessionFactory sessionFactory) {this.sessionFactory = sessionFactory; }

    @Override
    public List<Conference> findAll() {
        try (Session session = sessionFactory.openSession()) {
            List<Conference> conferenceList = session.createQuery("from Conference", Conference.class).list();
            conferenceList.forEach(System.out::println);
            return conferenceList;
        }
    }

    @Override
    public Conference getById(int id) {
        return null;
    }

    @Override
    public boolean insertConference(Conference conference) {
        return false;
    }

    @Override
    public boolean deleteConference(int id) {
        return false;
    }
}
