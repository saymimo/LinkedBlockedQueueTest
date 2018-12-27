package com.jdream.main;

import com.jdream.entity.Process1;
import com.jdream.entity.Process2;
import com.jdream.entity.Process3;
import com.jdream.queue.AbsQueueProcess;
import com.jdream.queue.QueueProcessFactory;
import com.jdream.queue.QueueProcessTypeEnum;

public class Main {
	
	public void start(){
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS1).start();
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS2).start();
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS3).start();
	}
	
	public void end(){
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS1).end();
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS2).end();
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS3).end();
	}
	
	public static void main(String[] args) {
		Main m=new Main();
		m.start();
		Process1 pro1=new Process1("11111");
		Process2 pro2=new Process2("22222");
		Process3 pro3=new Process3("33333");
		for(int i=0;i<10000;i++){
			QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS1).addTaskObjToQueue(pro1);
		}
		System.out.println("测试1");
		for(int i=0;i<10000;i++){
			QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS2).addTaskObjToQueue(pro2);
		}
		System.out.println("测试2");
		
		QueueProcessFactory.getQueueProcess(QueueProcessTypeEnum.PROCESS3).addTaskObjToQueue(pro3);
		
		//m.end();
		
	}

}
