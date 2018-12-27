package com.jdream.queue;

public class QueueProcessFactory {
	
	private static QueueProcess1 queueProcess1=new QueueProcess1();
	private static QueueProcess2 queueProcess2=new QueueProcess2();
	private static QueueProcess3 queueProcess3=new QueueProcess3();
	
	public static AbsQueueProcess getQueueProcess(QueueProcessTypeEnum type){
		if(type==QueueProcessTypeEnum.PROCESS1){
			return queueProcess1;
		}else if(type==QueueProcessTypeEnum.PROCESS2){
			return queueProcess2;
		}else if(type==QueueProcessTypeEnum.PROCESS3){
			return queueProcess3;
		}
		return null;
	}

}
