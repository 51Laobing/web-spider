package cn.web.spider.scheduler.component;

import cn.web.spider.Request;
import cn.web.spider.Task;


public interface DuplicateRemover {

    public boolean isDuplicate(Request request, Task task);

 
    public void resetDuplicateCheck(Task task);

    
    public int getTotalRequestsCount(Task task);

}
