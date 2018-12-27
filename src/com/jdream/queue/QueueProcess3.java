package com.jdream.queue;

import com.jdream.entity.Process3;

public class QueueProcess3 extends AbsQueueProcess<Process3> {

	@Override
	protected void process(Process3 obj) {
		System.out.println(obj.getName()+"开始处理");
		System.out.println(obj.getName());
	}

}
