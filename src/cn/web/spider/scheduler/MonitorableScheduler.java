package cn.web.spider.scheduler;

import cn.web.spider.Task;

/**
 * The scheduler whose requests can be counted for monitor.
 *
 * @authorkeehang
 * @since 0.5.0
 */
public interface MonitorableScheduler extends Scheduler {

    public int getLeftRequestsCount(Task task);

    public int getTotalRequestsCount(Task task);

}