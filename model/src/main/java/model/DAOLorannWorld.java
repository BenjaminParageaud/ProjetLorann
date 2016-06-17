package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import element.Element;
import mobile.MobileFactory;
import motionless.MotionLessFactory;

/**
 * The Class DAOLorannWorld.
 *
 * @author Clément Moreau
 */
public class DAOLorannWorld extends DAOEntity<LorannWorldEntity> {


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
	 * @see model.DAOEntity#find(int)
	 */


	public LorannWorldEntity findMotionLess(final int id) {
		LorannWorldEntity lorannWorldEntity = new LorannWorldEntity();

		try {
			final String sql = "{call LorannWorldMotionLessByIdMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
				lorannWorldEntity.addElement(MotionLessFactory.getFromBddId(resultSet.getInt("IdMotionLess")), resultSet.getInt("positionX"), resultSet.getInt("positionY"));
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return lorannWorldEntity;
	}

	public LorannWorldEntity findMotion(final int id) {
		LorannWorldEntity lorannWorldEntity = new LorannWorldEntity();

		try {
			final String sql = "{call LorannWorldMotionByIdMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
				lorannWorldEntity.addMobile(MobileFactory.getFromBddId(resultSet.getInt("IdMotion")), resultSet.getInt("positionX"), resultSet.getInt("positionY"));
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return lorannWorldEntity;
	}
}
