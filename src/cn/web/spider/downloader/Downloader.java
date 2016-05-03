package cn.web.spider.downloader;

import cn.web.spider.Page;
import cn.web.spider.Request;
import cn.web.spider.Task;

/**
 *
 * @author keehang
 * 
 */
public interface Downloader {

  
    public Page download(Request request, Task task);

    public void setThread(int threadNum);
}
