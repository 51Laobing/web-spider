package cn.web.spider.pipeline;

import cn.web.spider.ResultItems;
import cn.web.spider.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @authorkeehang
 * @since 0.4.0
 */
public class ResultItemsCollectorPipeline implements CollectorPipeline<ResultItems> {

    private List<ResultItems> collector = new ArrayList<ResultItems>();

    @Override
    public synchronized void process(ResultItems resultItems, Task task) {
        collector.add(resultItems);
    }

    @Override
    public List<ResultItems> getCollected() {
        return collector;
    }
}
