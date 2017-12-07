package vn.nano.photocropper.test5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import vn.nano.photocropper.CropImageView;
import vn.nano.photocropper.CropListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CropImageView cropImageView = findViewById(R.id.img_photo);
        cropImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.photo));

        final CropListener cropListener = new CropListener() {
            @Override
            public void onFinish(Bitmap bitmap) {
                ImageView imgCropped = findViewById(R.id.img_cropped);
                imgCropped.setImageBitmap(bitmap);
            }
        };

        findViewById(R.id.btn_crop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cropImageView.crop(cropListener, true);
            }
        });


    }
}
