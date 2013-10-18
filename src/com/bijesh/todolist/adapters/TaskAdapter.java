package com.bijesh.todolist.adapters;

import java.util.ArrayList;
import java.util.Date;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bijesh.todolist.R;
import com.bijesh.todolist.models.Priority;
import com.bijesh.todolist.models.Task;

public class TaskAdapter extends BaseAdapter{
    private ArrayList<Task> tasks = new ArrayList<Task>();
    public TaskAdapter(){
    	setContent();
    }
    private void setContent(){
    	tasks.add(new Task("Test", "This is test", Priority.HIGH, new Date(System.currentTimeMillis())));
    	tasks.add(new Task("Test1", "This is test1", Priority.HIGH, new Date(System.currentTimeMillis())));
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		System.out.println("in getCount");
		return tasks.size()-1;
	}

	@Override
	public Object getItem(int position) {
		System.out.println("in getItem");
		return position;
	}

	@Override
	public long getItemId(int index) {
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public View getView(int index, View view, ViewGroup parent) {
		System.out.println("in getView");
		if(view == null){
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view = inflater.inflate(R.layout.tasklistview, parent,false);
		}
		Task time = tasks.get(index);
		TextView tvName = (TextView)view.findViewById(R.id.task_name);
		TextView tvDesc = (TextView)view.findViewById(R.id.description);
		
		tvName.setText(time.getTaskName());
		tvDesc.setText(time.getTaskDescription());
		
		return view;
	}

}
