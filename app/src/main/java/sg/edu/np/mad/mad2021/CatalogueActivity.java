package sg.edu.np.mad.mad2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class CatalogueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        DBHandler dbHandler = new DBHandler(this, null, null, 1);
        List<AreaOfInterest> interestList = dbHandler.getAll();
        InterestAdapter adapter = new InterestAdapter(interestList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        RecyclerView rvInterest = findViewById(R.id.recyclerViewInterest);
        rvInterest.setLayoutManager(layoutManager);
        rvInterest.setAdapter(adapter);
    }
}