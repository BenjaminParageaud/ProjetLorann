package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import motionless.MotionLessFactory;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {


	/**
	 * Instantiates a new model.
	 */
	public Model() {
		
	}

	

	public Observable getObservable() {
		return this;
	}

	public void loadMessage(String key) {
		// TODO Auto-generated method stub
		
	}
}
