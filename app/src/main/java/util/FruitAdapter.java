package util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.listviewdemo.R;

import java.util.List;

import entity.Fruit;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceid;

    public FruitAdapter(Context context,  int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceid =textViewResourceId;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceid,parent,false);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}
