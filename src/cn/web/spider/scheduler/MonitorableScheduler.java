package cn.web.spider.scheduler;

import cn.web.spider.Task;

public interface MonitorableScheduler extends Scheduler {

    public int getLeftRequestsCount(Task task);

    public int getTotalRequestsCount(Task task);

}