# PhotoPolygonCropper
### Description
Crop photo using polygon
### Usage
- Add to `build.gradle` 

```
    compile 'vn.tinyhands:photo-cropper:0.0.1'
```
- Declare `CropImageView` in your layout
```
    <vn.nano.photocropper.CropImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/img_photo"
        />
```
- Set bitmap to crop
```
cropImageView.setImageBitmap(bitmap);
```
- Call `crop()` function, pass CropListener to get cropped bitmap
```
    cropImageView.crop(new CropListener() {
        @Override
        public void onFinish(Bitmap bitmap) {
            ImageView imgCropped = findViewById(R.id.img_cropped);
            imgCropped.setImageBitmap(bitmap);
        }
    });
````


