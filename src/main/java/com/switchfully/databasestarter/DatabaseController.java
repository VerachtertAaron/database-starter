package com.switchfully.databasestarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
@RequestMapping(path = "/database")
public class DatabaseController {
    final ApplicationContext context;

    final DataSource dataSource;

    @Autowired
    public DatabaseController(ApplicationContext context, DataSource dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @GetMapping(path = "/hr")
    public String createHrTable() throws SQLException {

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/hr-schema.sql"));
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/hr-data.sql"));
        return "OK";
    }

    @GetMapping(path = "/bank")
    public String createBankingTable() throws SQLException {

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/bank-schema.sql"));
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/bank-data.sql"));
        return "OK";
    }

    @GetMapping(path = "/delete")
    public String dropTable() throws SQLException {
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/hr-dropcascade.sql"));
        return "OK drop";
    }
}
