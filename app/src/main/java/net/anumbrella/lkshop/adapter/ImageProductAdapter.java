package net.anumbrella.lkshop.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.EasyRecyclerView;

import net.anumbrella.lkshop.R;
import net.anumbrella.lkshop.model.bean.ImageProductDataModel;

import java.util.List;

public class ImageProductAdapter extends RecyclerView.Adapter<ImageProductAdapter.ViewHolder> {
    private List<ImageProductDataModel>mList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_image_content,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageProductDataModel image=mList.get(position);
        holder.imageProduct.setImageURI(image.getImageUri());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        SimpleDraweeView imageProduct;

        public ViewHolder(View itemView) {
            super(itemView);
            imageProduct=(SimpleDraweeView) itemView.findViewById(R.id.image_product);
        }

    }
    public ImageProductAdapter(List<ImageProductDataModel> imageList){
        mList=imageList;
    }
}
