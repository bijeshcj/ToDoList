package com.bijesh.todolist;

import com.bijesh.todolist.adapters.TaskAdapter;
import com.bijesh.todolist.logger.S;
import com.bijesh.todolist.logger.Severe;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class HomeActivity extends BaseActivity{
	private TaskAdapter adapter;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_base);
	
	ListView listView = (ListView)findViewById(R.id.tasksList);
	adapter = new TaskAdapter();
	listView.setAdapter(adapter);
	
}

}
