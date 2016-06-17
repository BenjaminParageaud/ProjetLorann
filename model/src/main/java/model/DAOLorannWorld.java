package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import motionless.MotionLessFactory;

/**
 * The Class DAOLorannWorld.
 *
 * @author Clément Moreau
 */
public class DAOLorannWorld extends DAOEntity<LorannWorld> {

	/**
	 * Instantiates a new DAO lorann world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOLorannWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */

	
	public LorannWorld find(final int id) {

		try {
			final String sql = "{call LorannWorldByIdMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
				//LorannWorld.addElement(MotionLessFactory.getFromBddId(resultSet.getInt("bddID")), resultSet.getInt("posX"), resultSet.getInt("posY"));
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
