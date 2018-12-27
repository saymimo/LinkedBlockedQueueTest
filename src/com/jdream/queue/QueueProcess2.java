package com.jdream.queue;

import com.jdream.entity.Process2;


public class QueueProcess2 extends AbsQueueProcess<Process2> {

	@Override
	protected void process(Process2 obj) {
		System.out.println(obj.getName()+"开始处理");
		System.out.println(obj.getName());
	}

	
}
