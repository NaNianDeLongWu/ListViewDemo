package com.android.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import entity.Fruit;
import util.FruitAdapter;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();//初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple = new Fruit("apple",R.drawable.one);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana",R.drawable.two);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange",R.drawable.three);
            fruitList.add(orange);
            Fruit pen = new Fruit("pen",R.drawable.four);
            fruitList.add(pen);
        }
    }
}
