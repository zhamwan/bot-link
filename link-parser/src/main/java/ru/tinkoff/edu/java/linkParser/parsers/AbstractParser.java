package ru.tinkoff.edu.java.linkParser.parsers;

import ru.tinkoff.edu.java.linkParser.records.Result;

public abstract class AbstractParser {
    AbstractParser nextParser;


    public static AbstractParser link(AbstractParser first, AbstractParser... chain){
        AbstractParser head = first;
        for (AbstractParser nextInChain: chain) {
            head.nextParser = nextInChain;
            head = nextInChain;
        }
        return first;
    }


    public abstract Result parse(String url);


    protected Result checkNext(String url){
        if(nextParser == null){
            return null;
        }
        return nextParser.parse(url);
    }


    public String parsUrl(String url){
        if(url.substring(0, 8).equals("https://")){
            return url.substring(8);
        }
        if(url.substring(0, 7).equals("http://")){
            return url.substring(7);
        }
        return null;
    }
}
