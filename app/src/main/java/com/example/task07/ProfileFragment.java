package com.example.task07;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class ProfileFragment extends Fragment {
    private ImageView imageView1, imageView2, imageView3, imageView4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        imageView1 = (ImageView) view.findViewById(R.id.image_view1);
        imageView2 = (ImageView) view.findViewById(R.id.image_view2);
        imageView3 = (ImageView) view.findViewById(R.id.image_view3);
        imageView4 = (ImageView) view.findViewById(R.id.image_view4);

        String url1 = "https://www.pixelstalk.net/wp-content/uploads/2016/10/Canada-Backgrounds-620x349.jpg";
        String url2 ="https://www.pixelstalk.net/wp-content/uploads/2016/10/Canada-Backgrounds-Computer-620x388.jpg";

        Picasso.get()
                .load(url1)
                /**
                 * .resize method is used to resize image in pixels
                 */
                //.resize(300,300)
                /**
                 * To resize the image in dp
                 */
                .resizeDimen(R.dimen.image_size_width,R.dimen.image_size_height)
                // if the image is small size it will result in low quality for that we use the following method
                .onlyScaleDown()
                .into(imageView1);

        Picasso.get()
                .load(url2)
                /**
                 * .resize method is used to resize image in pixels
                 */
                //.resize(300,300)
                /**
                 * To resize the image in dp
                 */
                .resizeDimen(R.dimen.image_size_width,R.dimen.image_size_height)
                // if the image is small size it will result in low quality for that we use the following method
                .onlyScaleDown()
                .into(imageView2);

        Picasso.get()
                .load(url1)
                /**
                 *  This method measure width and height of imageView where it load the image into
                 *  and resize the image accordingly but here we have to give the size in XML
                 */
                .fit()
                .into(imageView3);
        Picasso.get()
                .load(url2)
                /**
                 *  This method measure width and height of imageView where it load the image into
                 *  and resize the image accordingly but here we have to give the size in XML
                 */
                .fit()
                .into(imageView4);

        return view;
    }
}
