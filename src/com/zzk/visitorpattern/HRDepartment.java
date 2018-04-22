package com.zzk.visitorpattern;
//人力资源部类：具体访问者类
public class HRDepartment extends Department {

	//实现人力资源部对全职员工的访问
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("正式员工" + employee.getName() + "实际工作时间为" + workTime + "小时");
		if(workTime > 40) {
			System.out.println("正式员工" + employee.getName() + "实际工作时间为" + workTime + "小时");
		}
		else if(workTime < 40) {
			System.out.println("正式员工" + employee.getName() + "请假时间为" + (40 -workTime) + "小时");
		}
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		// TODO Auto-generated method stub
		
	}
	
}
