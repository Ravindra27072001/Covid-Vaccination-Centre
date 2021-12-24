package com.example.covidvaccination.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidvaccination.R;
import com.example.covidvaccination.model.VaccineModel;

import java.util.List;

public class VaccinationInformationAdapter extends RecyclerView.Adapter<VaccinationInformationAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<VaccineModel> list_vaccine_center;

    public VaccinationInformationAdapter(Context mcontext, List<VaccineModel> list_vaccine_center) {
        this.layoutInflater = LayoutInflater.from(mcontext);
        this.list_vaccine_center = list_vaccine_center;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.veccination_info_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.vaccinationCenter.setText(list_vaccine_center.get(position).getVaccineCenter());
        holder.vaccinationCenterAddress.setText(list_vaccine_center.get(position).getVaccinationCenterAddress());
        holder.vaccinationTiming.setText(list_vaccine_center.get(position).getVaccinationTimings()+ " _ "+
                list_vaccine_center.get(position).getVaccineCenterTime());
        holder.vaccineName.setText(list_vaccine_center.get(position).getVaccineName());
        holder.vaccinationAvailable.setText(list_vaccine_center.get(position).getVaccineAvailable());
        holder.vaccineCharges.setText(list_vaccine_center.get(position).getVaccinationCharges());
        holder.vaccinationAge.setText(list_vaccine_center.get(position).getVaccinationAge());
    }

    @Override
    public int getItemCount() {
        return list_vaccine_center.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView vaccinationCenter;
        TextView vaccinationCenterAddress;
        TextView vaccinationTiming;
        TextView vaccineName;
        TextView vaccineCharges;
        TextView vaccinationAge;
        TextView vaccinationAvailable;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vaccinationAge = itemView.findViewById(R.id.vaccinationAge);
            vaccinationAvailable = itemView.findViewById(R.id.isAvailable);
            vaccineCharges = itemView.findViewById(R.id.vaccineCharges);
            vaccineName = itemView.findViewById(R.id.vaccineName);
            vaccinationTiming = itemView.findViewById(R.id.vaccineTiming);
            vaccinationCenter = itemView.findViewById(R.id.vaccineCenter);
            vaccinationCenterAddress = itemView.findViewById(R.id.vaccineLocation);
        }
    }
}
