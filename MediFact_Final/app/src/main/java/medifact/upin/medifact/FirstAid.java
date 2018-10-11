package medifact.upin.medifact;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class FirstAid extends Fragment {

    Button clk;
    VideoView videoView;

    View parentHolder;
    MediaController mediaController;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        parentHolder = inflater.inflate(R.layout.video_layout, container, false);
        clk = (Button) parentHolder.findViewById(R.id.button2);
        videoView = parentHolder.findViewById(R.id.videoView);
        mediaController = new MediaController(parentHolder.getContext());

        clk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videopath = "android.resource://medifact.upin.medifact/" + R.raw.firstaid;

                Uri uri = Uri.parse(videopath);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);

                videoView.start();
            }
        });
        return parentHolder;
    }
}



