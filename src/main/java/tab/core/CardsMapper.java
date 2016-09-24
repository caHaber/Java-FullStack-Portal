package tab.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;


public class CardsMapper implements ResultSetMapper<Card> {
    public Card map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException
    {
        return new Card(resultSet.getString(2), resultSet.getString(1));
    }
}
