package com.example.camera2_api_ex;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.imageView);
        String img = getIntent().getStringExtra("img");

        Bitmap bitmap = BitmapFactory.decodeFile(img);
        // Matrix 객체 생성
        Matrix matrix = new Matrix();
        // 오른쪽으로 90도 회전
        matrix.postRotate(90);

        // 새로운 Bitmap 생성
        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);

        // ImageView에 설정
        imageView.setImageBitmap(rotatedBitmap);
    }
}
