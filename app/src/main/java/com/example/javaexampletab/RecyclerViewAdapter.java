package com.example.javaexampletab;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ContactViewHolder> {

    Context contactContext;
    List<Contact> myData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context contactContext, List<Contact> myData) {
        this.contactContext = contactContext;
        this.myData = myData;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(contactContext).inflate(R.layout.item_contact,
                parent, false);
        ContactViewHolder viewHolder = new ContactViewHolder(v);

        //Dialog ini

        myDialog = new Dialog(contactContext);
        myDialog.setContentView(R.layout.dialog_contact);
        //invisible background
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));



        viewHolder.itemContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialogNameId = (TextView) myDialog.findViewById(R.id.dialogNameId);
                TextView dialogPhoneId = (TextView) myDialog.findViewById(R.id.dialogPhoneId);
                ImageView faceImageView = (ImageView) myDialog.findViewById(R.id.faceImageView);

                dialogNameId.setText(myData.get(viewHolder.getAdapterPosition()).getName());
                dialogPhoneId.setText(myData.get(viewHolder.getAdapterPosition()).getPhone());
                faceImageView.setImageResource(myData.get(viewHolder.getAdapterPosition()).getPhoto());
               /* Toast.makeText(contactContext, "Test Click"
                                + String.valueOf(viewHolder.getAdapterPosition()),
                        Toast.LENGTH_SHORT).show();

                */
                myDialog.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.nameTextView.setText(myData.get(position).getName());
        holder.phoneTextView.setText(myData.get(position).getPhone());
        holder.imageView.setImageResource(myData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout itemContact;
        private TextView nameTextView;
        private TextView phoneTextView;
        private ImageView imageView;

        public ContactViewHolder(View itemView) {
            super(itemView);

            itemContact = (LinearLayout) itemView.findViewById(R.id.contactItemId);
            nameTextView = (TextView) itemView.findViewById(R.id.nameContact);
            phoneTextView = (TextView) itemView.findViewById(R.id.numberContact);
            imageView = (ImageView) itemView.findViewById(R.id.contactImage);
        }
    }
}
