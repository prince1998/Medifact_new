package medifact.upin.medifact;

import android.app.Activity;
import android.app.Fragment;
import android.app.Notification;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.graphics.Bitmap;

public class Updates extends Fragment {
    Activity UpdatesActivity;
    View parentHolder;
    Button tips;
Button b;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        UpdatesActivity = getActivity();
        parentHolder = inflater.inflate(R.layout.updates, container, false);
        tips = parentHolder.findViewById(R.id.tips);
        b=parentHolder.findViewById(R.id.button);
        return parentHolder;
    }







        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            //you can set the title for your toolbar here for different fragments different titles
            getActivity().setTitle("Menu 1");
            tips.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    NotificationCompat.Builder notif=new NotificationCompat.Builder(getActivity());
                            notif.setSmallIcon(android.R.drawable.stat_notify_more);
                       notif.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher)); //how does this work
                        notif.setContentTitle("Hey");
                        notif.setContentText("Did You Drink Water?");
                    notif.setDefaults(Notification.DEFAULT_ALL);
                    NotificationManagerCompat notif2=NotificationManagerCompat.from(getActivity());
                    notif2.notify(1, notif.build());

                }
            });





            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/search?dcr=0&source=hp&ei=g2PPWu3kF8fHvgSTnKGIAg&q=nearby+hospitals&oq=nearby+hospitals&gs_l=psy-ab.3..0l8j0i22i30k1l2.1458.8274.0.8696.11.11.0.0.0.0.174.1208.1j8.9.0....0...1c.1.64.psy-ab..2.9.1208...0i131k1j0i10k1j0i13k1.0.q_Jpm26_t1w"));
                    startActivity(intent);

                }
            });




        }

    }



