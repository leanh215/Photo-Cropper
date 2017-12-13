# PhotoPolygonCropper
### Description
Crop photo using polygon
### Usage

<img src="https://raw.githubusercontent.com/leanh215/PhotoPolygonCropper/master/demo.gif" width="300">

- Add to `build.gradle` 

```
    compile 'vn.tinyhands:photo-cropper:0.0.5'
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
- Call `crop()` function to get cropped bitmap
```
    cropImageView.crop(Croplistener cropListener, boolean needStretch);
````


