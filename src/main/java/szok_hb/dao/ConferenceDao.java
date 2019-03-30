package szok_hb.dao;

import szok_hb.tables.Conference;

import java.util.List;

public interface ConferenceDao {

    List<Conference> findAll();
    Conference getById(int id);
    boolean insertConference(Conference conference);
    boolean deleteConference(int id);
}
