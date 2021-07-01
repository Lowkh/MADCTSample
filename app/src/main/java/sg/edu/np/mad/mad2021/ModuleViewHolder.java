package sg.edu.np.mad.mad2021;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ModuleViewHolder extends RecyclerView.ViewHolder {

    final TextView module;

    public ModuleViewHolder(@NonNull View itemView) {
        super(itemView);

        module = itemView.findViewById(R.id.textViewModule);
    }
}
