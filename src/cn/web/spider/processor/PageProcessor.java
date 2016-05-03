package cn.web.spider.processor;

import cn.web.spider.Page;
import cn.web.spider.Site;


public interface PageProcessor {

    public void process(Page page);

   
    public Site getSite();
}
