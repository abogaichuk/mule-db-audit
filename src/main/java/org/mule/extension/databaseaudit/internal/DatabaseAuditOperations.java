package org.mule.extension.databaseaudit.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.extension.databaseaudit.internal.utils.LogLevels;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Placement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class DatabaseAuditOperations {

  private static final Logger logger = LoggerFactory.getLogger(DatabaseAuditOperations.class);

  @Parameter
  @Placement(order = 1)
  private LogLevels logLevels;

  @MediaType(value = ANY, strict = false)
  public void logMessage(@Config DatabaseAuditConfiguration configuration, String logMessage, String flowName) throws SQLException {
    logger.info("we want save the message: "+ logMessage);
    Connection connection = configuration.getDatasource().getConnection();
    logger.info("connection != null : "+(connection != null));
  }
}
