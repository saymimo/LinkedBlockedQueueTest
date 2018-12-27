package com.jdream.queue;

import java.util.concurrent.LinkedBlockingQueue;

public abstract class AbsQueueProcess<T> extends Thread {
	
	//阻塞队列
	private LinkedBlockingQueue<T> queue=new LinkedBlockingQueue<T>();
    private boolean isRun = true;

    /**
     * 添加任务对象,最终的暴露项(对象可在其他包调用)
     * @param taskObj
     */
    public void addTaskObjToQueue(T taskObj){
        try {
            queue.put(taskObj);
            System.out.println("**********队列添加阶段**** "+taskObj.toString());
        } catch (InterruptedException e) {
        	System.out.println("添加到队列出现异常,队列当前情况:"+queue);
        }
    }
    
    public void end(){
        isRun=false;
    }
    
    /**
     * 声明为protected 具体的实现类,外部new子对象时,确保该方法不可直接被调用
     */
    protected abstract void process(T obj);
    
    /**
     * 死循环遍历阻塞队列
     */
    @Override
    public void run(){
        while(isRun){
            try {
            	T obj=queue.take();
            	System.out.println("**********出队列处理阶段********* "+obj.toString());
                process(obj);
            }catch (Exception e){
            	System.out.println("队列处理异常"+e.toString());
            }
        }
    }
    
   

}
