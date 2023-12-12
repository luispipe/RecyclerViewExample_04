package com.example.recyclerviewexample_04;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Item> data;

    private LayoutInflater inflater;

    private Context context;

    public ItemAdapter(List<Item> data, Context context) {
        this.data = data;
        this.inflater= LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.item,null);
        return new ItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
            holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setItem(List<Item>items){
        data=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon;
        TextView name,city,value;

        public ViewHolder(View itemView){
            super(itemView);
            this.icon= itemView.findViewById(R.id.ivItem);
            this.name=itemView.findViewById(R.id.tvItemName);
            this.city=itemView.findViewById(R.id.tvItemCity);
            this.value=itemView.findViewById(R.id.tvItemPrice);
        }

        void bindData(final Item item){
            icon.setColorFilter(Color.parseColor(item.getColor()));
            name.setText(item.getName());
            city.setText(item.getCity());
            value.setText(item.getValue()+"");
        }
    }

}
