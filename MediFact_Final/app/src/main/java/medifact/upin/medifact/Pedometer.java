package medifact.upin.medifact;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public  class Pedometer extends Fragment {

    View parentHolder;
    Button button;
    Activity UpdatesActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        parentHolder = inflater.inflate(R.layout.pedometer, container, false);
        button = (Button) parentHolder.findViewById(R.id.pedometer);
        UpdatesActivity = getActivity();
        return parentHolder;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("medifact.upin.medifact.Pedo_New");
                    startActivity(intent);
            }
        });
    }
}