//package com.biller.patti;
//
//import com.biller.patti.config.DataSourceConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@RestController
//public class JDBCController {
//
//    @Autowired
//    DataSourceConfig dataSourceConfig;
//
//    private DataSource dataSource;
//    private boolean result;
//
//    @RequestMapping(value = "/")
//    public void connectionJDBC() throws SQLException {
//        dataSource = dataSourceConfig.dataSource();
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from profile");
//        result = preparedStatement.execute();
//    }
//}
