package sg.edu.np.mad.mad2021;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InterestViewHolder extends RecyclerView.ViewHolder {

    private final ModuleAdapter adapter;

    final TextView title;
    final RecyclerView rvModule;
    final List<String> moduleList;

    public InterestViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.textViewTitle);
        rvModule = itemView.findViewById(R.id.recyclerViewModule);

        moduleList = new ArrayList<>();
        adapter = new ModuleAdapter(moduleList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);

        rvModule.setLayoutManager(layoutManager);
        rvModule.setAdapter(adapter);
    }

    void setModuleList(List<String> moduleList) {
        this.moduleList.clear();
        this.moduleList.addAll(moduleList);
        adapter.notifyDataSetChanged();
    }
}
