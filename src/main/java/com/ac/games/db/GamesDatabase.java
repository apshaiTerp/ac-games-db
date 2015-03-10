package com.ac.games.db;

import java.util.List;

import com.ac.games.data.BGGGame;
import com.ac.games.data.CoolStuffIncPriceData;
import com.ac.games.data.Game;
import com.ac.games.data.GameReltn;
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
   * This method should delete the requested {@link MiniatureMarketPriceData} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param mmID The mmID from Miniature Market for this game.
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteMMPriceData(long mmID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Query to read {@link Game} content from the database
   * 
   * @param gameID The gameID we want to find
   * 
   * @return A {@link Game} object, nor null if not found
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   */
  public Game readGame(long gameID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should insert the new {@link Game} data into the database.  If the object already
   * exists, this method can throw a {@link DatabaseOperationException}.
   * 
   * @param game The {@link Game} object to be written to the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void insertGame(Game game) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should update the new {@link Game} data into the database.  If the object does not
   * exist, this method can throw a {@link DatabaseOperationException}.
   * 
   * @param game The {@link Game} object to be written to the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void updateGame(Game game) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should delete the requested {@link Game} data from the database.  If the object does
   * not exist (or no rows were deleted), this method may throw a {@link DatabaseOperationException}.
   * 
   * @param gameID The gameID for this Game in the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteGame(long gameID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Query to read {@link GameReltn} content from the database
   * 
   * @param gameID The gameID we want to find
   * 
   * @return A {@link GameReltn} object, nor null if not found
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   */
  public GameReltn readGameReltn(long gameID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should insert the new {@link GameReltn} data into the database.  If the object already
   * exists, this method can throw a {@link DatabaseOperationException}.
   * 
   * @param gameReltn The {@link GameReltn} object to be written to the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void insertGameReltn(GameReltn gameReltn) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method should update the new {@link Game} data into the database.  If the object does not
   * exist, this method can throw a {@link DatabaseOperationException}.  Probably the most common
   * interaction with this object aside from queries.
   * 
   * @param gameReltn The {@link GameReltn} object to be written to the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void updateGameReltn(GameReltn gameReltn) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * This method will probably never be used.  It is valid for implementations to not support this
   * operation.  Adding for CRUD completionism.  It's a syndrome.
   * 
   * @param reltnID The reltnID for this GameReltn in the database.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public void deleteGameReltn(long reltnID) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Custom Query to get the list of all BoardGameGeek bggIDs currently in our index.
   * 
   * @return A list of bggIDs, or an empty list if none exist.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   */
  public List<Long> getBggIDList() throws ConfigurationException, DatabaseOperationException;

  /**
   * Custom Query to get the list of all CoolStuffInc csiIDs currently in our index.
   * 
   * @return A list of csiIDs, or an empty list if none exist.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<Long> getCSIIDList() throws ConfigurationException, DatabaseOperationException;

  /**
   * Custom Query to get the list of all Miniature Market mmIDs currently in our index.
   * 
   * @return A list of mmIDs, or an empty list if none exist.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<Long> getMMIDList() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Custom Query to get the list of all Game gameIDs currently in our index.
   * 
   * @return A list of gameIDs, or an empty list if none exist.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<Long> getGameIDList() throws ConfigurationException, DatabaseOperationException;

  /**
   * Custom Query to get the list of all GameReltn reltnIDs currently in our index.
   * 
   * @return A list of reltnIDs, or an empty list if none exist.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<Long> getGameReltnIDList() throws ConfigurationException, DatabaseOperationException;

  /**
   * Simple method that allows me to fetch the maximum ID value for this column
   * 
   * @return the maxID value found, or -1 if unable to find it.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public long getMaxBGGGameID() throws ConfigurationException, DatabaseOperationException;

  /**
   * Simple method that allows me to fetch the maximum ID value for this column
   * 
   * @return the maxID value found, or -1 if unable to find it.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public long getMaxCSIDataID() throws ConfigurationException, DatabaseOperationException;

  /**
   * Simple method that allows me to fetch the maximum ID value for this column
   * 
   * @return the maxID value found, or -1 if unable to find it.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public long getMaxMMDataID() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Simple method that allows me to fetch the maximum ID value for this column
   * 
   * @return the maxID value found, or -1 if unable to find it.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public long getMaxGameID() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Simple method that allows me to fetch the total count of rows in this table.
   * 
   * @return the count of rows found, which may be 0.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public int getBGGGameCount() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Simple method that allows me to fetch the total count of rows in this table.
   * 
   * @return the count of rows found, which may be 0.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public int getCSIDataCount() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Simple method that allows me to fetch the total count of rows in this table.
   * 
   * @return the count of rows found, which may be 0.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public int getMMDataCount() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Simple method that allows me to fetch the total count of rows in this table.
   * 
   * @return the count of rows found, which may be 0.
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public int getGameCount() throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Method that allows us to build a dynamic query based on which fields have been provided
   * in the queryGame object.
   * 
   * @param queryGame The data we want to query for.  The only fields filled out in this object should be
   * fields we want included in our query
   * @param rowLimit A rowLimit cap for our results, -1 if we want all.
   * 
   * @return A List of {@link BGGGame} entries that match the provided criteria
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<BGGGame> readAdHocBGGQuery(BGGGame queryGame, int rowLimit) throws ConfigurationException, DatabaseOperationException;
  
  /**
   * Method that allows us to build a dynamic query based on which fields have been provided
   * in the queryGame object.
   * 
   * @param queryData The data we want to query for.  The only fields filled out in this object should be
   * fields we want included in our query
   * @param rowLimit A rowLimit cap for our results, -1 if we want all.
   * 
   * @return A List of {@link CoolStuffIncPriceData} entries that match the provided criteria
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<CoolStuffIncPriceData> readAdHocCSIQuery(CoolStuffIncPriceData queryData, int rowLimit) throws ConfigurationException, DatabaseOperationException;

  /**
   * Method that allows us to build a dynamic query based on which fields have been provided
   * in the queryGame object.
   * 
   * @param queryData The data we want to query for.  The only fields filled out in this object should be
   * fields we want included in our query
   * @param rowLimit A rowLimit cap for our results, -1 if we want all.
   * 
   * @return A List of {@link MiniatureMarketPriceData} entries that match the provided criteria
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<MiniatureMarketPriceData> readAdHocMMQuery(MiniatureMarketPriceData queryData, int rowLimit) throws ConfigurationException, DatabaseOperationException;

  /**
   * Method that allows us to build a dynamic query based on which fields have been provided
   * in the queryGame object.
   * 
   * @param queryGame The data we want to query for.  The only fields filled out in this object should be
   * fields we want included in our query
   * @param rowLimit A rowLimit cap for our results, -1 if we want all.
   * 
   * @return A List of {@link Game} entries that match the provided criteria
   * 
   * @throws ConfigurationException Throws this exception if the database connection is not active.
   * @throws DatabaseOperationException Throws this exception if there are errors during the execution
   * of the requested operation.
   */
  public List<Game> readAdHocGameQuery(Game queryGame, int rowLimit) throws ConfigurationException, DatabaseOperationException;
}
