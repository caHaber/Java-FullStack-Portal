package tab.db;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import tab.core.Card;
import tab.core.CardsMapper;

@RegisterMapper(CardsMapper.class)
public interface CardDAO {

	
	@SqlQuery("SELECT * FROM TP_VISUALS")
    List<Card> getAll();
	
}
