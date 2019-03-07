package com.google.ch07;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.*;

public class Rizi {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);
        Handler  handler = new ConsoleHandler();//FileHandler
        handler.setLevel(Level.ALL);//ls ~ 能看到java0.log的文件，里面就是日志

        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
//                if(record.getMessage().length()<3)
//                    return false;
//                else
//                    return true;
                return record.getMessage().length() < 3 ? false : true;
            }
        };//过滤器
        logger.setFilter(filter);

        Formatter formatter = new Formatter() {
            @Override
           public String format(LogRecord record) {
               return LocalDateTime.now().toString() +":"+record.getMessage()+";\n";
           }
       };//格式化器
        handler.setFormatter(formatter);


        Logger.getGlobal().severe("what");//基本日志
        Logger.getGlobal().config("is");
        Logger.getGlobal().warning("your");
        Logger.getGlobal().fine("name");
        Logger.getGlobal().info("?" );//默认情况是info
        Logger.getGlobal().finer("hao");
        Logger.getGlobal().finest("lei");
    }
}
