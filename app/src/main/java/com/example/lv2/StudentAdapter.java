package com.example.lv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Student> dataList;
    final int HEADER = -1;
    final int STUDENT = -2;

    public StudentAdapter(List<Student> myDataset)
    {
        dataList = myDataset;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // create a new view
        View view = (View) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.student_holder, viewGroup, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        StudentViewHolder studentViewHolder = (StudentViewHolder) viewHolder;
        studentViewHolder.tvIme.setText(dataList.get(position).getIme());
        studentViewHolder.tvPrezime.setText(dataList.get(position).getPrezime());
        studentViewHolder.tvPredmet.setText(dataList.get(position).getPredmet());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
       /* if(datalist.get(position) instanceof Student)
        {
            return STUDENT;
        }
        else
        {
            return HEADER;
        }*/
       return position;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvIme;
        TextView tvPrezime;
        TextView tvPredmet;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvIme = itemView.findViewById(R.id.tvIme);
            tvPrezime = itemView.findViewById(R.id.tvPrezime);
            tvPredmet = itemView.findViewById(R.id.tvPredmet);
        }
    }
}
