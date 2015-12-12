package com.example.hssider.listevent.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hssider.listevent.R;
import com.example.hssider.listevent.holder.DepartmentHolder;
import com.example.hssider.listevent.model.Department;

import java.util.List;

/**
 * Created by hssider on 12/10/15.
 */
public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentHolder> {

    private List<Department> departments;

    public DepartmentAdapter(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public DepartmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View itemView = inflater.inflate(R.layout.row_department, parent, false);
        return new DepartmentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DepartmentHolder departmentHolder, int position) {
        final Department department = departments.get(position);
        departmentHolder.bind(department);
    }

    @Override
    public int getItemCount() {
        return  departments.size();
    }
}
