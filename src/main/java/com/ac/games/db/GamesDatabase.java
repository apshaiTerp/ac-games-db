package com.ac.games.db;

import com.ac.games.data.BGGGame;
import com.ac.games.data.CoolStuffIncPriceData;
import com.ac.games.data.MiniatureMarketPriceData;
import com.ac.games.db.exception.ConfigurationException;
import com.ac.games.db.exception.DatabaseOperationException;

/**
 * This interface needs to account for all database CRUD operations that can be performed.  Additional
 * tasks may be added to here or to an additional interface, but all basic objects from the pojos library
 * should be implemented via method calls in this interface, rather than stacking a bunch of interfaces
 * together.
 * 
 * @author ac010168
 */
public interface GamesDatabase {

  //**********  Implementing Basic Maintenance Tasks for the Database Connection  **********
  /**
   * This method should specifically open the connection to the provided database implementation.
   * @throws ConfigurationException Throws this Exception if there are configuration problems that prevent
   * the database connection from being established.
   */
  public void initializeDBConnection() throws ConfigurationException;
  
  /**
   * This method should specifically close the open connection to the provided database implementation.
   * This method should not throw an error if the database connection has not been opened.
   * 
   * @throws ConfigurationException Throws this Exception if there were problems closing down the open
   * database connection.
   */
  public void closeDBConnection() throws ConfigurationException;
  
  //**********  Implementing Basic CRUD Operations for BGGData  **********
  /**
   * This method should query the database for the requested {@link BGGGame} by bggID.
   * 
   * @param bggID The bggID from BoardGameGeek for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public BGGGame readBGGGameData(long bggID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should insert the new {@link BGGGame} data into the database.  If the object already
   * exists, this method should throw a {@link DatabaseOperationException}.
   * 
   * @param game The {@link BGGGame} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void insertBGGGameData(BGGGame game) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should update the existing {@link BGGGame} data into the database.  If the object does
   * not exist (or no rows were updated), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param game The {@link BGGGame} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void updateBGGGameData(BGGGame game) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should delete the provided {@link BGGGame} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param game The {@link BGGGame} object to be deleted from the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteBGGGameData(BGGGame game) throws ConfigurationException, DatabaseOperationException;
    
  /**
   * This method should delete the requested {@link BGGGame} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param bggID The bggID from BoardGameGeek for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteBGGGameData(long bggID) throws ConfigurationException, DatabaseOperationException;
  
  //**********  Implementing Basic CRUD Operations for CoolStuffIncPriceData  **********
  /**
   * This method should query the database for the requested {@link CoolStuffIncPriceData} by csiID.
   * 
   * @param csiID The csiID from CoolStuffInc for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public CoolStuffIncPriceData readCSIPriceData(long csiID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should insert the new {@link CoolStuffIncPriceData} data into the database.  If the object already
   * exists, this method should throw a {@link DatabaseOperationException}.
   * 
   * @param csiData The {@link CoolStuffIncPriceData} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void insertCSIPriceData(CoolStuffIncPriceData csiData) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should update the existing {@link CoolStuffIncPriceData} data into the database.  If the object does
   * not exist (or no rows were updated), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param csiData The {@link CoolStuffIncPriceData} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void updateCSIPriceData(CoolStuffIncPriceData csiData) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should delete the provided {@link CoolStuffIncPriceData} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param csiData The {@link CoolStuffIncPriceData} object to be deleted from the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteCSIPriceData(CoolStuffIncPriceData csiData) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should delete the requested {@link CoolStuffIncPriceData} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param csiID The csiID from CoolStuffInc for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteCSIPriceData(long csiID) throws ConfigurationException, DatabaseOperationException;

  //**********  Implementing Basic CRUD Operations for MiniatureMarketPriceData  **********
  /**
   * This method should query the database for the requested {@link MiniatureMarketPriceData} by mmID.
   * 
   * @param mmID The mmID from Miniature Market for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public MiniatureMarketPriceData readMMPriceData(long mmID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should insert the new {@link MiniatureMarketPriceData} data into the database.  If the object already
   * exists, this method should throw a {@link DatabaseOperationException}.
   * 
   * @param mmData The {@link MiniatureMarketPriceData} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void insertMMPriceData(MiniatureMarketPriceData mmData) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should update the existing {@link MiniatureMarketPriceData} data into the database.  If the object does
   * not exist (or no rows were updated), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param mmData The {@link MiniatureMarketPriceData} object to be written to the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void updateMMPriceData(MiniatureMarketPriceData mmData) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should delete the provided {@link MiniatureMarketPriceData} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param mmData The {@link MiniatureMarketPriceData} object to be deleted from the database.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteMMPriceData(MiniatureMarketPriceData mmData) throws ConfigurationException, DatabaseOperationException;

  /**
   * This method should delete the requested {@link MiniatureMarketPriceData} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param mmID The mmID from Miniature Market for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteMMPriceData(long mmID) throws ConfigurationException, DatabaseOperationException;
}
