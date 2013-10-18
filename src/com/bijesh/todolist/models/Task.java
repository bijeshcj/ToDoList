package com.bijesh.todolist.models;

import java.util.Date;

public class Task {
   private String taskName;
   private Date taskCreateDate;
   private Date taskScheduleDate;
   private String taskDescription;
   private Priority priority;
   public Task(String name,String des,Priority prio,Date scheduleDate){
	   this.taskName = name;
	   this.taskDescription = des;
	   this.priority = prio;
	   this.taskScheduleDate = scheduleDate;
   }
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public Date getTaskCreateDate() {
	return taskCreateDate;
}
public void setTaskCreateDate(Date taskCreateDate) {
	this.taskCreateDate = taskCreateDate;
}
public Date getTaskScheduleDate() {
	return taskScheduleDate;
}
public void setTaskScheduleDate(Date taskScheduleDate) {
	this.taskScheduleDate = taskScheduleDate;
}
public String getTaskDescription() {
	return taskDescription;
}
public void setTaskDescription(String taskDescription) {
	this.taskDescription = taskDescription;
}
public Priority getPriority() {
	return priority;
}
public void setPriority(Priority priority) {
	this.priority = priority;
}
   
}
