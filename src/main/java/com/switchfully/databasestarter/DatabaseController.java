package com.switchfully.databasestarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String createSimpleTable() throws SQLException {

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql/hr.sql"));
        return "OK";
    }
}
