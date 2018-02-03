package com.developer.imlv.languagelearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IMLV on 02-02-2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Context context,ArrayList<Word>words,int ColorResourceId){
        super(context,0,words);
        mColorResourceId=ColorResourceId;
    }
    @Override

    public View getView(int position,View convertView,ViewGroup parent){

    View listItemView = convertView;
        if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }

    // Get the {@link AndroidFlavor} object located at this position in the list
    Word currentWord = getItem(position);

    // Find the TextView in the list_item.xml layout with the ID version_name
    TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_text_view);
    // Get the version name from the current AndroidFlavor object and
    // set this text on the name TextView
        miwokText.setText(currentWord.getMiwokTranslation());

    // Find the TextView in the list_item.xml layout with the ID version_number
    TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
    // Get the version number from the current AndroidFlavor object and
    // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());
        //ImageView Implimentation
        ImageView imageView =(ImageView)listItemView.findViewById(R.id.image1);
        if(currentWord.hasImage()){
        imageView.setImageResource(currentWord.getmImageResourceId());
        imageView.setVisibility(View.VISIBLE);}
        else{
            imageView.setVisibility(View.GONE);}

            View textContainer = listItemView.findViewById(R.id.text_container);
        int Color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(Color);
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//    ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
    // Get the image resource ID from the current AndroidFlavor object and
    // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

    // Return the whole list item layout (containing 2 TextViews and an ImageView)
    // so that it can be shown in the ListView
        return listItemView;
}



}
