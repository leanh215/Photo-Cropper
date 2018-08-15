package vn.nano.photocropper.photocropper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import vn.nano.photocropper.CropImageView;
import vn.nano.photocropper.CropListener;

public class MainActivity extends AppCompatActivity {

    Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img_test);
        final CropImageView cropImageView = findViewById(R.id.crop_image_view);
        cropImageView.setImageBitmap(mBitmap);

        final CropListener listener = new CropListener() {
            @Override
            public void onFinish(Bitmap bitmap) {
//                cropImageView.setImageBitmap(bitmap);
                findViewById(R.id.crop_image_view).setVisibility(View.GONE);

                findViewById(R.id.img_cropped).setVisibility(View.VISIBLE);
                ((ImageView)findViewById(R.id.img_cropped)).setImageBitmap(bitmap);
            }
        };

        findViewById(R.id.btn_crop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cropImageView.crop(listener, true);
            }
        });

        findViewById(R.id.btn_rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateBitmap();
            }
        });
    }

    private void rotateBitmap() {
        Matrix matrix = new Matrix();
        matrix.postRotate( 90);

        mBitmap = Bitmap.createBitmap(mBitmap, 0, 0, mBitmap.getWidth(), mBitmap.getHeight(), matrix, false);
        ((CropImageView) findViewById(R.id.crop_image_view)).setImageBitmap(mBitmap);
    }

}
