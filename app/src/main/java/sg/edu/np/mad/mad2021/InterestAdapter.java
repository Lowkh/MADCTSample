package sg.edu.np.mad.mad2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InterestAdapter extends RecyclerView.Adapter<InterestViewHolder> {

    private final List<AreaOfInterest> interestList;

    public InterestAdapter(List<AreaOfInterest> interestList) {
        this.interestList = interestList;
    }

    @NonNull
    @Override
    public InterestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_interest, parent, false);
        return new InterestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InterestViewHolder holder, int position) {
        AreaOfInterest interest = interestList.get(position);
        holder.title.setText(interest.getTitle());
        holder.setModuleList(interest.getModules());
    }

    @Override
    public int getItemCount() {
        return interestList.size();
    }
}
