package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import mobile.MobileFactory;
import motionless.MotionLessFactory;


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


	public LorannWorldEntity find(final int id) {
		LorannWorldEntity lorannWorldEntity = new LorannWorldEntity();
		try {
			final String sql = "{call LorannWorldByIdMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
				if(MotionLessFactory.getFromBddId(resultSet.getInt("Id_MotionlessElements")) != null){
					lorannWorldEntity.addElement(MotionLessFactory.getFromBddId(resultSet.getInt("Id_MotionlessElements")), resultSet.getInt("positionX"), resultSet.getInt("positionY"));	
					//System.out.println("tests1");
					//System.out.println(MotionLessFactory.getFromBddId(resultSet.getInt("Id_MotionlessElements")));
					//System.out.println(resultSet.getInt("Id_MotionElements"));
					//	System.out.println(MobileFactory.getFromBddId(resultSet.getInt("Id_MotionElements")));
				}

				else if(resultSet.getInt("Id_MotionElements") > 1){

					lorannWorldEntity.addMobile(MobileFactory.getFromBddId(resultSet.getInt("Id_MotionElements"), lorannWorldEntity), resultSet.getInt("positionX"), resultSet.getInt("positionY"));
				}
				else if(resultSet.getInt("Id_MotionElements") == 1){

					lorannWorldEntity.addHero(MobileFactory.getFromBddIdHero(resultSet.getInt("Id_MotionElements"), lorannWorldEntity), resultSet.getInt("positionX"), resultSet.getInt("positionY"));
				}
			}

			return lorannWorldEntity;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
