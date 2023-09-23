package com.example.imageslider.ImageSlider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imageslider.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {
    private List<SliderHelperClass> sliderHelperClass;
    private ViewPager2 viewPager2;
    public SliderAdapter(List<SliderHelperClass> sliderHelperClass, ViewPager2 viewPager2) {
        this.sliderHelperClass = sliderHelperClass;
        this.viewPager2 = viewPager2;
    }



    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.slider_item,
                        parent,
                        false)

        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(sliderHelperClass.get(position));
    }

    @Override
    public int getItemCount() {
        return sliderHelperClass.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        private RoundedImageView imageView;

        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSilder);

        }
        void setImage(SliderHelperClass sliderHelperClass){
            imageView.setImageResource(sliderHelperClass.getImage());

        }
    }


}
