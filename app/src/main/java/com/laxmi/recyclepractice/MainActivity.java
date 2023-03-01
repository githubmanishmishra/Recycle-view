package com.laxmi.recyclepractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Employee> arrayList = new ArrayList<>();
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Employee emp = new Employee(R.drawable.p,5,"Nirbhay");
        recyclerView = findViewById(R.id.recyclerEmp);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       arrayList.add(new Employee(R.drawable.p,"4","Nirbhay"));
        arrayList.add(new Employee(R.drawable.q,"6","Suman"));
        arrayList.add(new Employee(R.drawable.r,"7","Arvind"));
        arrayList.add(new Employee(R.drawable.s,"8","Saurabh"));
        arrayList.add(new Employee(R.drawable.t,"9","Saroj"));
        arrayList.add(new Employee(R.drawable.u,"10","Gopal"));
        arrayList.add(new Employee(R.drawable.v,"11","muna"));
        arrayList.add(new Employee(R.drawable.u,"12","Jitu"));
        arrayList.add(new Employee(R.drawable.p,"13","Vinod"));
        arrayList.add(new Employee(R.drawable.r,"14","Manoj"));
        arrayList.add(new Employee(R.drawable.q,"15","Govind"));
        arrayList.add(new Employee(R.drawable.v,"16","Sanjay"));
        arrayList.add(new Employee(R.drawable.s,"18","Saurabh"));
        arrayList.add(new Employee(R.drawable.p,"4","Nirbhay"));
        arrayList.add(new Employee(R.drawable.q,"6","Suman"));
        arrayList.add(new Employee(R.drawable.r,"7","Arvind"));
        arrayList.add(new Employee(R.drawable.s,"8","Saurabh"));
        arrayList.add(new Employee(R.drawable.t,"9","Saroj"));
        arrayList.add(new Employee(R.drawable.u,"10","Gopal"));
        arrayList.add(new Employee(R.drawable.v,"11","muna"));
        arrayList.add(new Employee(R.drawable.u,"12","Jitu"));
        arrayList.add(new Employee(R.drawable.p,"13","Vinod"));
        arrayList.add(new Employee(R.drawable.r,"14","Manoj"));
        arrayList.add(new Employee(R.drawable.q,"15","Govind"));
        arrayList.add(new Employee(R.drawable.v,"16","Sanjay"));
        arrayList.add(new Employee(R.drawable.s,"18","Saurabh"));
        arrayList.add(new Employee(R.drawable.p,"4","Nirbhay"));
        arrayList.add(new Employee(R.drawable.q,"6","Suman"));
        arrayList.add(new Employee(R.drawable.r,"7","Arvind"));
        arrayList.add(new Employee(R.drawable.s,"8","Saurabh"));
        arrayList.add(new Employee(R.drawable.t,"9","Saroj"));
        arrayList.add(new Employee(R.drawable.u,"10","Gopal"));
        arrayList.add(new Employee(R.drawable.v,"11","muna"));
        arrayList.add(new Employee(R.drawable.u,"12","Jitu"));
        arrayList.add(new Employee(R.drawable.p,"13","Vinod"));
        arrayList.add(new Employee(R.drawable.r,"14","Manoj"));
        arrayList.add(new Employee(R.drawable.q,"15","Govind"));
        arrayList.add(new Employee(R.drawable.v,"16","Sanjay"));
        arrayList.add(new Employee(R.drawable.s,"18","Saurabh"));
        Adapterrecycleemp adapter = new Adapterrecycleemp(this,arrayList);
        recyclerView.setAdapter(adapter);
    }
}