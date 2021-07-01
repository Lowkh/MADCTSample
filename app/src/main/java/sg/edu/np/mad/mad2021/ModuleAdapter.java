package sg.edu.np.mad.mad2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleViewHolder> {

    private final List<String> moduleList;

    public ModuleAdapter(List<String> moduleList) {
        this.moduleList = moduleList;
    }

    @NonNull
    @Override
    public ModuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_module, parent, false);
        return new ModuleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder holder, int position) {
        String module = moduleList.get(position);
        holder.module.setText(module);
    }

    @Override
    public int getItemCount() {
        return moduleList.size();
    }
}
