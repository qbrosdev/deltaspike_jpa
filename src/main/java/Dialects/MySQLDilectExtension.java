package Dialects;

import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

import java.sql.Types;

public class MySQLDilectExtension extends MySQLDialect {
    public MySQLDilectExtension() {
        super();
        registerColumnType(Types.BIT, "bit");
        registerColumnType(Types.BIGINT, "bigint");
        registerColumnType(Types.SMALLINT, "smallint");
        registerColumnType(Types.TINYINT, "tinyint");
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.CHAR, "char(1)");
        registerColumnType(Types.FLOAT, "float");
        registerColumnType(Types.DOUBLE, "double precision");
        registerColumnType(Types.DATE, "date");
        registerColumnType(Types.TIME, "time");
        registerColumnType(Types.TIMESTAMP, "datetime");
        registerColumnType(Types.VARBINARY, "longblob");
        registerColumnType(Types.VARBINARY, 16777215, "mediumblob");
        registerColumnType(Types.VARBINARY, 65535, "blob");
        registerColumnType(Types.VARBINARY, 255, "tinyblob");
        registerColumnType(Types.BINARY, "binary($l)");
        registerColumnType(Types.LONGVARBINARY, "longblob");
        registerColumnType(Types.LONGVARBINARY, 16777215, "mediumblob");
        registerColumnType(Types.NUMERIC, "decimal($p,$s)");
        registerColumnType(Types.BLOB, "longblob");
//		registerColumnType( Types.BLOB, 16777215, "mediumblob" );
//		registerColumnType( Types.BLOB, 65535, "blob" );
        registerColumnType(Types.CLOB, "longtext");
//		registerColumnType( Types.CLOB, 16777215, "mediumtext" );
//		registerColumnType( Types.CLOB, 65535, "text" );
        registerVarcharTypes();

        registerFunction("ascii", new StandardSQLFunction("ascii", StandardBasicTypes.INTEGER));
        registerFunction("bin", new StandardSQLFunction("bin", StandardBasicTypes.STRING));
        registerFunction("char_length", new StandardSQLFunction("char_length", StandardBasicTypes.LONG));
        registerFunction("character_length", new StandardSQLFunction("character_length", StandardBasicTypes.LONG));
        registerFunction("lcase", new StandardSQLFunction("lcase"));
        registerFunction("lower", new StandardSQLFunction("lower"));
        registerFunction("ltrim", new StandardSQLFunction("ltrim"));
        registerFunction("ord", new StandardSQLFunction("ord", StandardBasicTypes.INTEGER));
        registerFunction("quote", new StandardSQLFunction("quote"));
        registerFunction("reverse", new StandardSQLFunction("reverse"));
        registerFunction("rtrim", new StandardSQLFunction("rtrim"));
        registerFunction("soundex", new StandardSQLFunction("soundex"));
        registerFunction("space", new StandardSQLFunction("space", StandardBasicTypes.STRING));
        registerFunction("ucase", new StandardSQLFunction("ucase"));
        registerFunction("upper", new StandardSQLFunction("upper"));
        registerFunction("unhex", new StandardSQLFunction("unhex", StandardBasicTypes.STRING));

        registerFunction("abs", new StandardSQLFunction("abs"));
        registerFunction("sign", new StandardSQLFunction("sign", StandardBasicTypes.INTEGER));

        registerFunction("acos", new StandardSQLFunction("acos", StandardBasicTypes.DOUBLE));
        registerFunction("asin", new StandardSQLFunction("asin", StandardBasicTypes.DOUBLE));
        registerFunction("atan", new StandardSQLFunction("atan", StandardBasicTypes.DOUBLE));
        registerFunction("cos", new StandardSQLFunction("cos", StandardBasicTypes.DOUBLE));
        registerFunction("cot", new StandardSQLFunction("cot", StandardBasicTypes.DOUBLE));
        registerFunction("crc32", new StandardSQLFunction("crc32", StandardBasicTypes.LONG));
        registerFunction("exp", new StandardSQLFunction("exp", StandardBasicTypes.DOUBLE));
        registerFunction("ln", new StandardSQLFunction("ln", StandardBasicTypes.DOUBLE));
        registerFunction("log", new StandardSQLFunction("log", StandardBasicTypes.DOUBLE));
        registerFunction("log2", new StandardSQLFunction("log2", StandardBasicTypes.DOUBLE));
        registerFunction("log10", new StandardSQLFunction("log10", StandardBasicTypes.DOUBLE));
        registerFunction("pi", new NoArgSQLFunction("pi", StandardBasicTypes.DOUBLE));
        registerFunction("rand", new NoArgSQLFunction("rand", StandardBasicTypes.DOUBLE));
        registerFunction("sin", new StandardSQLFunction("sin", StandardBasicTypes.DOUBLE));
        registerFunction("sqrt", new StandardSQLFunction("sqrt", StandardBasicTypes.DOUBLE));
        registerFunction("tan", new StandardSQLFunction("tan", StandardBasicTypes.DOUBLE));

        registerFunction("radians", new StandardSQLFunction("radians", StandardBasicTypes.DOUBLE));
        registerFunction("degrees", new StandardSQLFunction("degrees", StandardBasicTypes.DOUBLE));

        registerFunction("ceiling", new StandardSQLFunction("ceiling", StandardBasicTypes.INTEGER));
        registerFunction("ceil", new StandardSQLFunction("ceil", StandardBasicTypes.INTEGER));
        registerFunction("floor", new StandardSQLFunction("floor", StandardBasicTypes.INTEGER));
        registerFunction("round", new StandardSQLFunction("round"));

        registerFunction("datediff", new StandardSQLFunction("datediff", StandardBasicTypes.INTEGER));
        registerFunction("timediff", new StandardSQLFunction("timediff", StandardBasicTypes.TIME));
        registerFunction("date_format", new StandardSQLFunction("date_format", StandardBasicTypes.STRING));

        registerFunction("curdate", new NoArgSQLFunction("curdate", StandardBasicTypes.DATE));
        registerFunction("curtime", new NoArgSQLFunction("curtime", StandardBasicTypes.TIME));
        registerFunction("current_date", new NoArgSQLFunction("current_date", StandardBasicTypes.DATE, false));
        registerFunction("current_time", new NoArgSQLFunction("current_time", StandardBasicTypes.TIME, false));
        registerFunction("current_timestamp", new NoArgSQLFunction("current_timestamp", StandardBasicTypes.TIMESTAMP, false));
        registerFunction("date", new StandardSQLFunction("date", StandardBasicTypes.DATE));
        registerFunction("day", new StandardSQLFunction("day", StandardBasicTypes.INTEGER));
        registerFunction("dayofmonth", new StandardSQLFunction("dayofmonth", StandardBasicTypes.INTEGER));
        registerFunction("dayname", new StandardSQLFunction("dayname", StandardBasicTypes.STRING));
        registerFunction("dayofweek", new StandardSQLFunction("dayofweek", StandardBasicTypes.INTEGER));
        registerFunction("dayofyear", new StandardSQLFunction("dayofyear", StandardBasicTypes.INTEGER));
        registerFunction("from_days", new StandardSQLFunction("from_days", StandardBasicTypes.DATE));
        registerFunction("from_unixtime", new StandardSQLFunction("from_unixtime", StandardBasicTypes.TIMESTAMP));
        registerFunction("hour", new StandardSQLFunction("hour", StandardBasicTypes.INTEGER));
        registerFunction("last_day", new StandardSQLFunction("last_day", StandardBasicTypes.DATE));
        registerFunction("localtime", new NoArgSQLFunction("localtime", StandardBasicTypes.TIMESTAMP));
        registerFunction("localtimestamp", new NoArgSQLFunction("localtimestamp", StandardBasicTypes.TIMESTAMP));
        registerFunction("microseconds", new StandardSQLFunction("microseconds", StandardBasicTypes.INTEGER));
        registerFunction("minute", new StandardSQLFunction("minute", StandardBasicTypes.INTEGER));
        registerFunction("month", new StandardSQLFunction("month", StandardBasicTypes.INTEGER));
        registerFunction("monthname", new StandardSQLFunction("monthname", StandardBasicTypes.STRING));
        registerFunction("now", new NoArgSQLFunction("now", StandardBasicTypes.TIMESTAMP));
        registerFunction("quarter", new StandardSQLFunction("quarter", StandardBasicTypes.INTEGER));
        registerFunction("second", new StandardSQLFunction("second", StandardBasicTypes.INTEGER));
        registerFunction("sec_to_time", new StandardSQLFunction("sec_to_time", StandardBasicTypes.TIME));
        registerFunction("sysdate", new NoArgSQLFunction("sysdate", StandardBasicTypes.TIMESTAMP));
        registerFunction("time", new StandardSQLFunction("time", StandardBasicTypes.TIME));
        registerFunction("timestamp", new StandardSQLFunction("timestamp", StandardBasicTypes.TIMESTAMP));
        registerFunction("time_to_sec", new StandardSQLFunction("time_to_sec", StandardBasicTypes.INTEGER));
        registerFunction("to_days", new StandardSQLFunction("to_days", StandardBasicTypes.LONG));
        registerFunction("unix_timestamp", new StandardSQLFunction("unix_timestamp", StandardBasicTypes.LONG));
        registerFunction("utc_date", new NoArgSQLFunction("utc_date", StandardBasicTypes.STRING));
        registerFunction("utc_time", new NoArgSQLFunction("utc_time", StandardBasicTypes.STRING));
        registerFunction("utc_timestamp", new NoArgSQLFunction("utc_timestamp", StandardBasicTypes.STRING));
        registerFunction("week", new StandardSQLFunction("week", StandardBasicTypes.INTEGER));
        registerFunction("weekday", new StandardSQLFunction("weekday", StandardBasicTypes.INTEGER));
        registerFunction("weekofyear", new StandardSQLFunction("weekofyear", StandardBasicTypes.INTEGER));
        registerFunction("year", new StandardSQLFunction("year", StandardBasicTypes.INTEGER));
        registerFunction("yearweek", new StandardSQLFunction("yearweek", StandardBasicTypes.INTEGER));

        registerFunction("hex", new StandardSQLFunction("hex", StandardBasicTypes.STRING));
        registerFunction("oct", new StandardSQLFunction("oct", StandardBasicTypes.STRING));

        registerFunction("octet_length", new StandardSQLFunction("octet_length", StandardBasicTypes.LONG));
        registerFunction("bit_length", new StandardSQLFunction("bit_length", StandardBasicTypes.LONG));

        registerFunction("bit_count", new StandardSQLFunction("bit_count", StandardBasicTypes.LONG));
        registerFunction("encrypt", new StandardSQLFunction("encrypt", StandardBasicTypes.STRING));
        registerFunction("md5", new StandardSQLFunction("md5", StandardBasicTypes.STRING));
        registerFunction("sha1", new StandardSQLFunction("sha1", StandardBasicTypes.STRING));
        registerFunction("sha", new StandardSQLFunction("sha", StandardBasicTypes.STRING));

        registerFunction("concat", new StandardSQLFunction("concat", StandardBasicTypes.STRING));

        getDefaultProperties().setProperty(Environment.MAX_FETCH_DEPTH, "2");
        getDefaultProperties().setProperty(Environment.STATEMENT_BATCH_SIZE, DEFAULT_BATCH_SIZE);
    }

    protected void registerVarcharTypes() {
        registerColumnType(Types.VARCHAR, "longtext");
//		registerColumnType( Types.VARCHAR, 16777215, "mediumtext" );
        registerColumnType(Types.VARCHAR, 65535, "ntext");
        registerColumnType(Types.VARCHAR, 255, "varchar($l)");
        registerColumnType(Types.LONGVARCHAR, "longtext");
    }
}
