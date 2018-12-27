package com.jdream.queue;

import com.jdream.entity.Process1;


public class QueueProcess1 extends AbsQueueProcess<Process1> {

	@Override
	protected void process(Process1 obj) {
		System.out.println(obj.getName()+"开始处理");
		System.out.println(obj.getName());
	}
}
