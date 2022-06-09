package com.example.gson_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ColorAdapter extends ArrayAdapter<MainActivity.Color> {

    private static class ViewHolder {
        TextView color;
        TextView value;
    }

    public ColorAdapter(Context context, ArrayList<MainActivity.Color> colors) {
        super(context, 0, colors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MainActivity.Color colors = getItem(position);
        ViewHolder viewHolder;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            //convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_view, parent, false);
            viewHolder.color = (TextView) convertView.findViewById(R.id.lcolor);
            viewHolder.value = (TextView) convertView.findViewById(R.id.lvalue);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        }
        else {
        // View is being recycled, retrieve the viewHolder object from tag
        viewHolder = (ViewHolder) convertView.getTag();
    }
        /*
        // Lookup view for data population
        TextView lcolor = (TextView) convertView.findViewById(R.id.lcolor);
        TextView lvalue = (TextView) convertView.findViewById(R.id.lvalue);
        // Populate the data into the template view using the data object
        lcolor.setText(colors.color);
        lvalue.setText(colors.value);
        // Return the completed view to render on screen

         */

        viewHolder.color.setText(colors.color);
        viewHolder.value.setText(colors.value);
        return convertView;
    }


}
